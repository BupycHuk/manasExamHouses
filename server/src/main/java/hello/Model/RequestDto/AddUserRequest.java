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
    private String name;
    private String contact;
    private String address;

    public AddUserRequest(){

    }
    public AddUserRequest(String name, String contact, String address ){

        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}