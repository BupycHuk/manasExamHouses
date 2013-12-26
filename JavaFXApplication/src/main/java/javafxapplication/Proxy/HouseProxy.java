package javafxapplication.Proxy;

import javafxapplication.Model.House;

public class HouseProxy extends Proxy {
    public House[] getHouseInfo() {
        return restTemplate.getForObject(urlService.GetServerUrl("/houses/"), House[].class);
    }
}

