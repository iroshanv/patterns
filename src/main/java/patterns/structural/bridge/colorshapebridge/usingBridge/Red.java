package patterns.structural.bridge.colorshapebridge.usingBridge;


public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("applying red color");
    }
}
