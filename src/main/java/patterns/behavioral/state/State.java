package patterns.behavioral.state;

public abstract class State {

    public void handleRequest() {
        System.out.println("shouldn't be able to get here.");
    }

}
