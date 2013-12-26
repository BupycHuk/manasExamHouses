package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.DeleteHouseRequest;
import hello.Model.Repository.HouseRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class HouseController {

    @RequestMapping(value = "/houses")
    public @ResponseBody
    Iterable<House> listHouses()
    {
        return  getRepository().findAll();
    }

    @RequestMapping(value = "/house/delete/{id}")
    public @ResponseBody
    boolean deletehouse(@PathVariable("id") long id)
    {
        getRepository().delete(id);
        return true;
    }

    @RequestMapping(value = "/addShop",method = RequestMethod.POST)
    public @ResponseBody
    House addHouse(@RequestBody DeleteHouseRequest addHouseRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        House house= new House(addHouseRequest.getAdress(),addHouseRequest.getPrice());
        getRepository().save(house);
        return house;
    }

    public HouseRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(HouseRepository.class);
    }
}
