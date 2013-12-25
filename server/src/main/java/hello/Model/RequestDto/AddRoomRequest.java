package hello.Model.RequestDto;

import java.io.Serializable;

public class AddRoomRequest implements Serializable {


    private long id;
    private String name;
    private String raion;
    private String baa;
    private String adress;

    public AddRoomRequest(){

    }
    public AddRoomRequest(String name, String raion, String baa, String adress){

        this.name = name;
        this.raion = raion;
        this.baa = baa;
        this.adress = adress;
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

    public String getRaion() {
        return raion;
    }

    public void setRaion(String raion) {
        this.raion = raion;
    }

    public String getBaa() {
        return baa;
    }

    public void setBaa(String baa) {this.baa = baa;}

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
