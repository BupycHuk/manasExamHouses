package hello.Model;

import javax.persistence.*;

@Entity
public class Shop
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="Райондун_аты")
    private String Райондун_аты;

    public String getName() {
        return Райондун_аты;
    }

    public void setName(String name) {
        this.Райондун_аты = name;
    }

    public long getId() {
        return id;
    }


}
