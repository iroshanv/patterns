package patterns.creational.builder.withoutbuilder;

import org.testng.annotations.Test;

public class LunchOrderBeanDemo {

    @Test
    public void lunchOrderBeanUsingSetters() {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("wheat");
        lunchOrderBean.setCondiments("lettuce");
        lunchOrderBean.setDressing("mustard");
        lunchOrderBean.setMeat("ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
