package patterns.behavioral.state;

public class AcLowState extends State {
    private AC ac;

    public AcLowState(AC ac) {
        this.ac = ac;
    }

    @Override
    public void handleRequest() {
        System.out.println("...turning ac to med");
        ac.setState(ac.getAcMedState());
    }

    @Override
    public String toString() {
        return "...ac is low";
    }
}
