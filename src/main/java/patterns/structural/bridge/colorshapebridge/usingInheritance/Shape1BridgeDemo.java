package patterns.structural.bridge.colorshapebridge.usingInheritance;

import org.testng.annotations.Test;

public class Shape1BridgeDemo {

    @Test
    public void shape1BridgeDemo() {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();
        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
