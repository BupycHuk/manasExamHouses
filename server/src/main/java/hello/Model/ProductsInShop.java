package hello.Model;

import javax.persistence.*;

@Entity
public class ProductsInShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="count")
    private Integer count;

    protected ProductsInShop() {}


    public long getId() {
        return id;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }





    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "provider")
    private Provider provider;

    public Provider getName(){
        return provider;
    }

    public void setName(Provider provider){
        this.provider=provider;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }


}

