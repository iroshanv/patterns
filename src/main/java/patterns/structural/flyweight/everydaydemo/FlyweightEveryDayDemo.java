package patterns.structural.flyweight.everydaydemo;

import org.testng.annotations.Test;

public class FlyweightEveryDayDemo {

    @Test
    public void flyweightEveryDayDemo() {

        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));

        String firstStr = "rishi";
        String secondStr = "rishi";
        String thirdStr = "tanay";

        System.out.println(System.identityHashCode(firstStr));
        System.out.println(System.identityHashCode(secondStr));
        System.out.println(System.identityHashCode(thirdStr));
    }
}
