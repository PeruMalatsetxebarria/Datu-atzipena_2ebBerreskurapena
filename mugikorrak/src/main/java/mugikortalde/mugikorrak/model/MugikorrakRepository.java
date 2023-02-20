package mugikortalde.mugikorrak.model;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MugikorrakRepository { //zertzuk di honek, metoduk? Honek gero MongoDBMugikorraRepository barrun garatu bidi
    List<Mugikorra> findAll();
    Mugikorra findById(String id);
    Mugikorra save(Mugikorra person);
    long delete(String izena);
}
