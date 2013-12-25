package hello.Controller;

import hello.Config;
import hello.Model.Repository.RoomRepository;
import hello.Model.Room;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import hello.Model.Repository.ShopRepository;


@Component
@Controller
public class RoomController {

    @RequestMapping(value = "/room")
    public @ResponseBody
    Iterable<Room> listRoom() {
    return  getRepository().findAll();
    }


    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("name") String name) {
        Iterable<Room> rooms = getRepository().findByName(name);
        getRepository().delete(listRoom());
        return true;
    }

    public RoomRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(RoomRepository.class);
    }

}

