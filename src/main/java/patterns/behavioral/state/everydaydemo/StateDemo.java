package patterns.behavioral.state.everydaydemo;

import org.testng.annotations.Test;

public class StateDemo {

    @Test
    public void stateDemo() {
        Fan fan = new Fan();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);

        fan.pullChain();
        System.out.println(fan);
    }
}
