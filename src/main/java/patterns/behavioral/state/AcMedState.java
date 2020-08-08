package patterns.behavioral.state;

public class AcMedState extends State {
    private AC ac;

    public AcMedState(AC ac) {
        this.ac = ac;
    }

    @Override
    public void handleRequest() {
        System.out.println("...turning ac to high");
        ac.setState(ac.getAcHighState());
    }

    @Override
    public String toString() {
        return "...ac is on medium ";
    }
}
