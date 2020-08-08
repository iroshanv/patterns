package patterns.creational.builder.lunchbuilder;

import org.testng.annotations.Test;

public class BuilderLunchOrderDemo {

    @Test
    public void builderLunchOrderDemo() {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("wheat").condiments("lettuce").dressing("mayo");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());


    }
}
