package hello.Model.Repository;

import hello.Model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {

    Iterable<Room> findByName(String Name);

}

