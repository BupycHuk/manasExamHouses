package javafxapplication.Model;


public class House {

    private long id;
    private String address;
    private double price;

    protected House(){}

    public House(String address, double price){
        this.address = address;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
