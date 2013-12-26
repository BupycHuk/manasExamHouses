package hello.Model;

import javax.persistence.*;

@Entity
public class SoldProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="Райондун_аты")
    private String Райондун_аты;


    protected SoldProducts() {}

    public SoldProducts(String Райондун_аты) {
        this.Райондун_аты=Райондун_аты;

    }

    public long getId() {
        return id;
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller")
    private Seller seller;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Райондун_аты")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}

