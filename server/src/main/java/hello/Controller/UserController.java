package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class UserController {
    @RequestMapping(value = "/User")
    public @ResponseBody
    Iterable<user> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public @ResponseBody
    User addUser(@RequestBody AddUserRequest addUserRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       HouseRepository HouseRepository = context.getBean(HouseRepository.class);
        House House = HouseRepository.findOne(addUserRequest.getHouseId());

        User User= new User(addUserRequest.getUsername(),addUserRequest.getLogin(),addUserRequest.getPassword());
        User.setHouse(House);
        getRepository().save(User);
        return User;
    }
    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("name") String name) {
        Iterable<User> User = getRepository().findByFullName(name);
        getRepository().delete(User);
        return true;
    }
    @RequestMapping(value = "/change/{name}", method = RequestMethod.PUT)
    public @ResponseBody
    boolean  changeUserPassword(@PathVariable("name") String name){
        Iterable<User> User = getRepository().findByFullName(name);
        getRepository().save(User);
        return true;
    }


    public UserRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(UserRepository.class);
    }
}

