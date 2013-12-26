package hello.Model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @Column(name="name")
    private String username;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    protected User(){}
    public User(String name, String contact, String adress) {
        this.name = name;
        this.contact = contact;
        this.adress = adress;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId)
    {
        this.userId =userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}

