package hello.Controller;

import hello.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.*;

/**
 * Created by admin on 26.12.13.
 */
public class HouseController {
    @RequestMapping(value = "/Houses")
    public @ResponseBody
    Iterable<House> listHouses() {

        return  getRepository().findAll();

    }

    @RequestMapping(value = "/Houses/delete/{id}")
    public @ResponseBody
    boolean deleteHouse(@PathVariable("id") long id) {

        getRepository().delete(id);
        return true;
    }

    @RequestMapping(value = "/addHouse",method = RequestMethod.POST)
    public @ResponseBody
    House addHouse(@RequestBody AddHouseRequest addHouseRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        House House= new House(addHouseRequest.getName(),addHouseRequest.getContacts());
        getRepository().save(House);
        return House;
    }

    public HouseRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(HouseRepository.class);
    }
}
