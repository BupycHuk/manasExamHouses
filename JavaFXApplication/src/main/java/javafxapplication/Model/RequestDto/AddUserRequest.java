package javafxapplication.Model.RequestDto;

import java.io.Serializable;
/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.12.13
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */
public class AddUserRequest implements Serializable{

    //private long id;
    private String name;
    private String contact;
    private String adress;

    public AddUserRequest()
    {

    }
    public AddUserRequest(String name, String contact, String adress)
    {
        this.name = name;
        this.contact = contact;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
