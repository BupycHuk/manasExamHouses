package hello.Model.RequestDto;

import java.io.Serializable;
/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 13:25
 * To change this template use File | Settings | File Templates.
 */
public class AddUserRequest implements Serializable {

    private long id;
    private String userName;
    private String email;
    private String password;

    public AddUserRequest()
    {

    }
    public AddUserRequest(String userName, String email, String password ){

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
