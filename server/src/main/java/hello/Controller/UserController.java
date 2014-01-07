package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.UserRepository;
//import hello.Model.Repository.ShopRepository;
import hello.Model.RequestDto.AddUserRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Component
@Controller
public class UserController {

    @RequestMapping(value = "/users")
    public @ResponseBody
    Iterable<User> listUsers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addUsers",method = RequestMethod.POST)
    public @ResponseBody
    User addUser(@RequestBody AddUserRequest addUserRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        User user= new User(addUserRequest.getName(),addUserRequest.getContact(),addUserRequest.getAddress());
        getRepository().save(user);
        return user;
    }


    public UserRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(UserRepository.class);
    }

}
