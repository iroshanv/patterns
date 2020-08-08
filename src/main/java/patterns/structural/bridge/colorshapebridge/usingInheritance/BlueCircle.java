package patterns.structural.bridge.colorshapebridge.usingInheritance;

public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("applying blue color");
    }
}
