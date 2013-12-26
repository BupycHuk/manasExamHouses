package hello.Model.Repository;

import hello.Model.District;
import org.springframework.data.repository.CrudRepository;

public interface DistrictRepository extends CrudRepository<District, Long> {
    Iterable<District> findById(Long id);
}
