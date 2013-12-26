package hello.Model.Repository;

import hello.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    Iterable<User> findByName (String username );

}

