package patterns.behavioral.observer.everydayexample;

import java.util.Observable;

public class TwitterStream extends Observable {

    public void someOneTweeted() {
        setChanged();
        notifyObservers();
    }
}
