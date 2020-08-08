package patterns.structural.decorator.sandwichdecorator;

public class SimpleSandwich implements Sandwich{
    @Override
    public String make() {
        return "bread";
    }
}
