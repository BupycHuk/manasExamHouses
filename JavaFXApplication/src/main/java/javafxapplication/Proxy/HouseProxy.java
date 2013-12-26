package javafxapplication.Proxy;

import javafxapplication.Model.AddHouseRequest;
import javafxapplication.Model.House;

public class HouseProxy extends Proxy {
    public boolean addSeller(AddHouseRequest houseAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addHouses/"), houseAddRequest, House.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public House[] getHouses() {
        return restTemplate.getForObject(urlService.GetServerUrl("/houses/"), House[].class);
    }

}
