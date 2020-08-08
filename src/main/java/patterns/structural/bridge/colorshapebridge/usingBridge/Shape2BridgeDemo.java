package patterns.structural.bridge.colorshapebridge.usingBridge;

import org.testng.annotations.Test;

public class Shape2BridgeDemo {

    @Test
    public void shape2BridgeDemo() {

        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();

    }
}
