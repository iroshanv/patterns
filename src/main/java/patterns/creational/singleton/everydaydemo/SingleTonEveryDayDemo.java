package patterns.creational.singleton.everydaydemo;

import org.testng.annotations.Test;

public class SingleTonEveryDayDemo {

    @Test
    public void singleTonEveryDayDemo() {

        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if (singletonRuntime == anotherInstance) {
            System.out.println("they are the same");
        }


    }
}
