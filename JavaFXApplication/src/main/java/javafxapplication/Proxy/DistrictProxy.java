package javafxapplication.Proxy;

import javafxapplication.Model.District;

public class DistrictProxy extends Proxy {
    public District[] getDistricts() {
        return restTemplate.getForObject(urlService.GetServerUrl("/districts/"), District[].class);
    }
}
