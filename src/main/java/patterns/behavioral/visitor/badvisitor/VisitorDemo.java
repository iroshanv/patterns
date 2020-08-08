package patterns.behavioral.visitor.badvisitor;

import org.testng.annotations.Test;

public class VisitorDemo {

    @Test
    public void visitorDemo() {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();
        System.out.println(shippingCost);
    }

}
