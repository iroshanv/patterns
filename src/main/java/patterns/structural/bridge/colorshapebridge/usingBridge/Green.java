package patterns.structural.bridge.colorshapebridge.usingBridge;

public class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("applying green color");
    }
}
