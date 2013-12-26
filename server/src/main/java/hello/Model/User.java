package hello.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="fullName")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public User(String fullName) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "house")
    private House house;

    public House getHouse() {
        return house;
    }

    public void setShop(House house) {
        this.house = house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}

