package hello.Controller;

import hello.Config;
import hello.Model.House;
import hello.Model.Repository.HouseRepository;
import hello.Model.Repository.UserRepository;
import hello.Model.RequestDto.AddUserRequest;
import hello.Model.RequestDto.AddHouseRequest;
import hello.Model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import hello.Model.Repository.ShopRepository;


@Component
@Controller
public class HouseController {

    @RequestMapping(value = "/house")
    public @ResponseBody
    Iterable<House> listHouses() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addHouses",method = RequestMethod.POST)
    public @ResponseBody
    House addUser(@RequestBody AddHouseRequest addHouseRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        ShopRepository shopRepository = context.getBean(ShopRepository.class);
//        Shop shop = shopRepository.findOne(addSellerRequest.getShopId());

        House house= new House(addHouseRequest.getDistrict_id(),addHouseRequest.getUser_id(),addHouseRequest.getAddress(),addHouseRequest.getPrice());
        getRepository().save(house);
        return house;
    }

    @RequestMapping(value = "/delete/{username}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("username") String username) {
        Iterable<House> houses = getRepository().findByName(username);
        getRepository().delete(houses);
        return true;
    }

    public HouseRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(HouseRepository.class);
    }

}