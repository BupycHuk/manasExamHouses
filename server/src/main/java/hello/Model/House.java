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

    public House(String adress, Double price, Raion raion, User user){
        this.adress = adress;
        this.price = price;
        this.raion = raion;
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
    @JoinColumn(name = "raion")
    private Raion raion;

    public Raion getRaion() {
        return raion;
    }

    public void setRaion(Raion raion) {
        this.raion = raion;
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
