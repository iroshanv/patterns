package patterns.behavioral.memento.everydayexample;

import java.io.Serializable;

public class Employee implements Serializable {

    private String ID;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
