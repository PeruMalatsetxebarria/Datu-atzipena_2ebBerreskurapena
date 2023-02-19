package mugikortalde.mugikorrak.model;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MugikorrakRepository {
    List<Mugikorra> findAll();
}
