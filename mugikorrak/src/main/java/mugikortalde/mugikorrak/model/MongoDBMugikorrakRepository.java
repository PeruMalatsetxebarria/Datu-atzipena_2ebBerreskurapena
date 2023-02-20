package mugikortalde.mugikorrak.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;


import static com.mongodb.client.model.Filters.eq;

@Repository
public class MongoDBMugikorrakRepository implements MugikorrakRepository {

    private static final TransactionOptions txnOptions = TransactionOptions.builder()
                                                                           .readPreference(ReadPreference.primary())
                                                                           .readConcern(ReadConcern.MAJORITY)
                                                                           .writeConcern(WriteConcern.MAJORITY)
                                                                           .build();
    @Autowired
    private MongoClient client;
    private MongoCollection<Mugikorra> mugikorraCollection;

    @PostConstruct
    void init() {
        mugikorraCollection = client.getDatabase("mugikorrak").getCollection("mugikorrak", Mugikorra.class);
    }//datu basi eta tabli aldatu

    @Override
    public List<Mugikorra> findAll() {
        return mugikorraCollection.find().into(new ArrayList<>());
    }

    @Override
    public Mugikorra findById(String id) {
        return mugikorraCollection.find(eq("_id", new ObjectId(id))).first();        
    }

    @Override
    public Mugikorra save(Mugikorra umea) {
        umea.setId(new ObjectId());
        mugikorraCollection.insertOne(umea);
        return umea;
    }

    @Override
    public long delete(String izena) {
        return mugikorraCollection.deleteMany(eq("izena", izena)).getDeletedCount();
    } //marka be gehittubida

}
