package javafxapplication.Model;

/**
 * Created by admin on 26.12.13.
 */
public class House {
    private long id;
    private String name;
    private String contacts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String toString()
    {
        return getName();

    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void setId(long id) {
        this.id = id;
    }
}
