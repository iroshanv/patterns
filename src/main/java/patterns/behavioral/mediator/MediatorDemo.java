package patterns.behavioral.mediator;

import org.testng.annotations.Test;

public class MediatorDemo {

    @Test
    public void mediatorDemo() {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightCommand(mediator);
        turnOffAllLightsCommand.execute();

    }

}
