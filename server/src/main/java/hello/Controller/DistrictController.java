package hello.Controller;

import hello.Config;
import hello.Model.District;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
@Component
@Controller
public class DistrictController {
    @RequestMapping(value = "/district")
    public @ResponseBody

    Iterable<District> listDistrict() {

        return  getRepository().findAll();
    }


    @RequestMapping(value = "/addDistrict",method = RequestMethod.POST)
    public @ResponseBody
    District addDistrict(@RequestBody AddDistrictRequest addDistrictRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        District seller= new District(addDistrictRequest.getName());
        getRepository().save(district);
        return district;
    }


    public DistrictRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(DistrictRepository.class);
    }
}
