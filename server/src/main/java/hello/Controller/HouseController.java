package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.HouseRepository;
import hello.Model.RequestDto.AddHouseRequest;
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
    Iterable<House> listHouse() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addHouse",method = RequestMethod.POST)
    public @ResponseBody
    House addHouse(@RequestBody AddHouseRequest addHouseRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        House house = new House (addHouseRequest.getAddress(),addHouseRequest.getPrice());
        getRepository().save(house);
        return house;
    }

    public HouseRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(HouseRepository.class);
    }
}
