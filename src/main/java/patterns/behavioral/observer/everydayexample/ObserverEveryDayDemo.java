package patterns.behavioral.observer.everydayexample;

public class ObserverEveryDayDemo {

    public static void main(String[] args) {

        TwitterStream messageStream = new TwitterStream();
        Client client1 = new Client("tanay");
        Client client2 = new Client("rishi");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someOneTweeted();

    }
}
