package patterns.behavioral.observer.everydayexample;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    private String name;

    Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + getName() +"'s stream. some one tweeted something");
    }
}
