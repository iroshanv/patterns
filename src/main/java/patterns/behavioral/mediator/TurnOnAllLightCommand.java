package patterns.behavioral.mediator;

public class TurnOnAllLightCommand implements Command {

    private Mediator mediator;
    public TurnOnAllLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
