package patterns.behavioral.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;
    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 15;
        System.out.println("wheels are bulky and expensive to ship");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 10;
        System.out.println("fenders are light and cheap to ship");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("oil is hazardous and has a fee to ship");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("if they bought more than 3 things we will give them a discount" +
                "on shipping");

        List<AtvPart> parts = partsOrder.getParts();
        if (parts.size() > 3) {
            shippingAmount -= 5;
        }
        System.out.println("shipping amount is " + shippingAmount);

    }
}
