package patterns.behavioral.command;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    @Test
    public void commandDemo() {
        Light bedRoomLight = new Light(); // receiver
        Light kitchenLight = new Light();
        Switch lightSwitch =  new Switch(); //invoker

        Command toggleCommand = new ToggleCommand(bedRoomLight);
        lightSwitch.storeAndExecute(toggleCommand);


        List<Light> lights = new ArrayList<>();
        lights.add(bedRoomLight);

        lights.add(kitchenLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
