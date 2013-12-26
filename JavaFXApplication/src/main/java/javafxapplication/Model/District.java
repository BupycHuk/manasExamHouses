package javafxapplication.Model;

/**
 * Created with IntelliJ IDEA.
 * User: Jazzy
 * Date: 26.12.13
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
public class District {

        private long id;
        private String Name;


        protected District() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {

        return Name;
    }

    public District(String Name) {
                this.Name = Name;

        }

}

