package patterns.structural.bridge.colorshapebridge.usingBridge;

public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("applying blue color");
    }
}
