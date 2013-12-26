package hello.Model.RequestDto;

import java.io.Serializable;

public class DeleteUserRequest implements Serializable {
    private long houseId;
    private String userfullName;
    private String email;
    private String password;

    public DeleteUserRequest()
    {

    }

    public DeleteUserRequest(long shopId, String sellername, String login, String password) {
        //To change body of created methods use File | Settings | File Templates.
        this.houseId = houseId;
        this.userfullName = userfullName;
        this.email = email;
        this.password = password;
    }

    public long getHouseId() {
        return houseId;
    }

    public void setHouseId(long shopId)
    {
        this.houseId =houseId;
    }

    public String getUserfullName() {
        return userfullName;
    }

    public void setUserfullName(String userfullName)
    {
        this.userfullName=userfullName;
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
