package patterns.behavioral.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("we have a wheel");
    }

    @Override
    public void visit(Fender fender) {
        System.out.println("we have a fender");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("we have oil");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("we have an order");
    }
}
