package patterns.behavioral.state;

public class AC {

    State acOffState;
    State acLowState;
    State acMedState;
    State acHighState;

    State state;

    public AC(){
        acOffState = new AcOffSate(this);
        acLowState = new AcLowState(this);
        acMedState = new AcMedState(this);
        acHighState = new AcHighState(this);

        state = acOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public State getAcOffState() {
        return this.acOffState;
    }

    public State getAcLowState() {
        return acLowState;
    }

    public State getAcMedState() {
        return acMedState;
    }

    public State getAcHighState() {
        return acHighState;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state.toString();
    }

}
