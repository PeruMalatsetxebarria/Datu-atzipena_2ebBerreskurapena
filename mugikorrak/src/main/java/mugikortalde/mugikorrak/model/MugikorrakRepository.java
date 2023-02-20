package mugikortalde.mugikorrak.model;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MugikorrakRepository {
    List<Mugikorra> findAll();
    List<Mugikorra> findMarka(String marka);
    Mugikorra findById(String modeloa);
    Mugikorra save(Mugikorra person);
    Mugikorra save2(Mugikorra person);
    long delete(String modeloa);
}
