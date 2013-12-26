package hello.Controller;

import hello.Config;
import hello.Model.District;
import hello.Model.Repository.DistrictRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class DistrictController {
    @RequestMapping(value = "/districts")
    public @ResponseBody
    Iterable<District> listDistricts() {

        return  getRepository().findAll();
    }

    public DistrictRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(DistrictRepository.class);
    }
}
