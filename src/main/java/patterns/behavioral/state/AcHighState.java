package patterns.behavioral.state;

public class AcHighState extends State {
    private AC ac;

    public AcHighState(AC ac) {
        this.ac = ac;
    }

    @Override
    public void handleRequest() {
        System.out.println("...turning ac off");
        ac.setState(ac.getAcOffState());
    }

    @Override
    public String toString() {
        return "...ac is on high";
    }
}
