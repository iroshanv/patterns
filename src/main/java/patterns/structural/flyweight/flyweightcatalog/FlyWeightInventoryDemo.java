package patterns.structural.flyweight.flyweightcatalog;

import org.testng.annotations.Test;

public class FlyWeightInventoryDemo {

    @Test
    public void flyWeightInventoryDemo() {

        InventorySystem ims = new InventorySystem();

        ims.takeOrder("roomba", 221);
        ims.takeOrder("head phones", 361);
        ims.takeOrder("tv", 23);

        ims.takeOrder("roomba", 121);
        ims.takeOrder("head phones", 261);
        ims.takeOrder("tv", 63);

        ims.takeOrder("roomba", 21);
        ims.takeOrder("head phones", 31);
        ims.takeOrder("tv", 2);

        ims.process();

        System.out.println(ims.report());


    }
}
