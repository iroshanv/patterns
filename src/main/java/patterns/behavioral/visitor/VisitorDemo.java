package patterns.behavioral.visitor;

import org.testng.annotations.Test;

public class VisitorDemo {

    @Test
    public void visitorDemo() {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        order.accept(new AtvPartsShippingVisitor());
        order.accept(new AtvPartsDisplayVisitor());
    }

}
