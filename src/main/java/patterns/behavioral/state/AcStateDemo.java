package patterns.behavioral.state;

import org.testng.annotations.Test;

public class AcStateDemo {

    @Test
    public void stateDemo() {
        AC ac = new AC();
        System.out.println(ac);

        ac.pullChain();
        System.out.println(ac);

        ac.pullChain();
        System.out.println(ac);

        ac.pullChain();
        System.out.println(ac);

        ac.pullChain();
        System.out.println(ac);

    }
}
