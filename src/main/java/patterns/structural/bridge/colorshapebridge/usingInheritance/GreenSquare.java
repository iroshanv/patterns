package patterns.structural.bridge.colorshapebridge.usingInheritance;

public class GreenSquare extends Square{
    @Override
    public void applyColor() {
        System.out.println("applying green color");
    }
}
