package hello.Controller;

import hello.Config;
import hello.Model.Raion;
import hello.Model.Repository.RaionRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class RaionController {
    @RequestMapping(value = "/raions")
    public @ResponseBody
    Iterable<Raion> listRaion() {

        return  getRepository().findAll();
    }

    public RaionRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(RaionRepository.class);
    }
}