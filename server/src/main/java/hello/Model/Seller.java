package hello.Model;

import javax.persistence.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="Райондун_аты")
    private String Райондун_аты;


    protected Seller() {}

    public Seller(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;

    }


    public String getРайондун_аты() {
        return Райондун_аты;
    }

    public void setFullName(String Райондун_аты) {
        this.Райондун_аты = Райондун_аты;
    }



    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "shop")
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}

