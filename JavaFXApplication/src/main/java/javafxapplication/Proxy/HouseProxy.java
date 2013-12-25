package javafxapplication.Proxy;

import javafxapplication.Model.House;


public class HouseProxy extends Proxy {


    public void deleteHouses(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/houses/delete/"+id), House[].class);

    }


    public House[] getHouses() {
        return restTemplate.getForObject(urlService.GetServerUrl("/houses/"), House[].class);
    }
}
