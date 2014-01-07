package hello.Model.Repository;

import hello.Model.Raion;
import org.springframework.data.repository.CrudRepository;

public interface RaionRepository extends CrudRepository<Raion, Long> {
    Iterable<Raion> findById(Long id);
}
