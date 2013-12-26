package hello.Model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="userName")
    private String userName;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    protected User() {}

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user")
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
////    @OneToMany (mappedBy = "User", orphanRemoval = true, cascade={CascadeType.ALL}, targetEntity = User.class)
//    @JsonIgnore(value = true)


}

