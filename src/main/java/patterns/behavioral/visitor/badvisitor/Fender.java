package patterns.behavioral.visitor.badvisitor;

public class Fender implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
