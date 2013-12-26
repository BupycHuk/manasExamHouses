package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.UserRepository;
import hello.Model.Repository.HouseRepository;
import hello.Model.RequestDto.DeleteUserRequest;
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

    @RequestMapping(value = "/delete/{fullName}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("fullName") String fullName) {
        Iterable<User> user = getRepository().findByFullName(fullName);
        getRepository().delete(user);
        return true;
    }

    public UserRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(UserRepository.class);
    }
}

}

