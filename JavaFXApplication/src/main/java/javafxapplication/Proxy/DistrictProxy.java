package javafxapplication.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:56
 * To change this template use File | Settings | File Templates.
 */
public class DistrictProxy extends Proxy {


        public boolean addDistrict(AddDistrictRequest districtAddRequest)
        {
            try {
                restTemplate.postForObject(urlService.GetServerUrl("/addDistrict/"), districtAddRequest, District.class);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;

        }

        public District[] getDistrict() {
            return restTemplate.getForObject(urlService.GetServerUrl("/districts/"), District[].class);
        }

}
