package patterns.behavioral.observer;

import org.testng.annotations.Test;


public class ObserverDemo {

    @Test
    public void observerDemo() {

        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("here is a new message !");
        tabletClient.addMessage("another new message !");

    }

}
