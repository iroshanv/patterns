package patterns.behavioral.visitor.badvisitor;

public class Wheel implements AtvPart {
    @Override
    public double calculateShipping() {
        return 12;
    }
}
