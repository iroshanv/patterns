package patterns.structural.bridge.colorshapebridge.usingInheritance;

public class RedSquare extends Square {

    @Override
    public void applyColor() {
        System.out.println("applying red color");
    }
}
