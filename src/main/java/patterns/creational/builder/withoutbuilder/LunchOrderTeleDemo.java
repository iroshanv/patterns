package patterns.creational.builder.withoutbuilder;

import org.testng.annotations.Test;

public class LunchOrderTeleDemo {


    @Test
    public void lunchOrderTeleUsingConstructor() {

        LunchOrderTele lunchOrderTele =
                new LunchOrderTele("wheat","lettuce", "mustard", "ham");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getCondiments());
        System.out.println(lunchOrderTele.getMeat());
        System.out.println(lunchOrderTele.getDressing());

    }

}
