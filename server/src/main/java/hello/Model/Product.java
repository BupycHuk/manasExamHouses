package hello.Model;

import javax.persistence.*;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="Райондун_аты")
    private String Райондун_аты;



    public long getId() {
        return id;
    }


}
