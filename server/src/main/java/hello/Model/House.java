package hello.Model;

import javax.persistence.*;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="address")
    private String address;
    @Column(name="price")
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;

    public User getUser() {
        return user;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "district")
    private District district;

    public District getDistrict() {
        return district;
    }
}
