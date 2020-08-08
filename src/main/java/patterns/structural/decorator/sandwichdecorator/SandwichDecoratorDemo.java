package patterns.structural.decorator.sandwichdecorator;

import org.testng.annotations.Test;

public class SandwichDecoratorDemo {

    @Test
    public void sandwichDecoratorDemo() {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());

    }
}

