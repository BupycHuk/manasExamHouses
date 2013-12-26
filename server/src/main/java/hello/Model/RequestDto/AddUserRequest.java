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

    private long userId;
    private String username;
    private String email;
    private String password;

    public AddUserRequest(){

    }
    public AddUserRequest(String username, String email, String password){

        this.username = username;
        this.email = email;
        this.password = password;
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
