package hello.Model.RequestDto;

import java.io.Serializable;

public class DeleteHouseRequest implements Serializable{

    private long id;
    private String adress;
    private double price;
    protected DeleteHouseRequest() {}

    public DeleteHouseRequest(String adress, double price) {
        this.adress = adress;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
