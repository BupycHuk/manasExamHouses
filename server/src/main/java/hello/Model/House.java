package hello.Model;

import javax.persistence.*;


@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="adress")
    private String adress;
    @Column(name="price")
    private Double price;

    protected House() {}

    public House(String adress, Double price, District district, User user) {
        this.adress = adress;
        this.price = price;
        this.district = district;
        this.user = user;

    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String address) {
        this.adress = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "district")
    private District district;

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


