package hello.Controller;

import hello.Config;
import hello.Model.House;
import hello.Model.Repository.HouseRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Component
@Controller
public class HouseController {

    @RequestMapping(value = "/houses")
    public @ResponseBody
    Iterable<House> listHouses() {

        return  getRepository().findAll();

    }

    @RequestMapping(value = "/houses/delete/{id}")
    public @ResponseBody
    boolean deleteHouse(@PathVariable("id") long id) {

        getRepository().delete(id);
        return true;
    }

    public HouseRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(HouseRepository.class);
    }
}

