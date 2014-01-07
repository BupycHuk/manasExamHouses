package javafxapplication.Proxy;

import javafxapplication.Model.Raion;

public class RaionProxy extends Proxy {
    public Raion[] getRaions() {
        return restTemplate.getForObject(urlService.GetServerUrl("/raions/"), Raion[].class);
    }
}