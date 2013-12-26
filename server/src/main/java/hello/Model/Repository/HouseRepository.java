package hello.Model.Repository;

import hello.Model.House;
import hello.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, String> {
    Iterable<House> findByName(String username);

}

