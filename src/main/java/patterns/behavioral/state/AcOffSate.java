package patterns.behavioral.state;

public class AcOffSate extends State {
    private AC ac;

    public AcOffSate(AC ac) {
        this.ac = ac;
    }

    @Override
    public void handleRequest() {
        System.out.println("...turning ac to low");
        ac.setState(ac.getAcLowState());
    }

    @Override
    public String toString() {
        return "...ac is off";
    }
}
