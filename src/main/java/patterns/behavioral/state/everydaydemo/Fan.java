package patterns.behavioral.state.everydaydemo;

public class Fan {

    final static int OFF = 0;
    final static int LOW = 1;
    final static int MED = 2;

    int state = OFF;

    public Fan(){}

    public void pullChain() {
        if (state == OFF) {
            System.out.println("turning fan on to low");
            state = LOW;
        }else if (state == LOW) {
            System.out.println("turning fan to med");
            state = MED;
        }else if (state == MED) {
            System.out.println("turning fan off");
            state = OFF;
        }
    }

    @Override
    public String toString() {
        if (state == OFF) {
            return "fan is off";
        } else if (state == LOW) {
            return "fan is on low";
        } else if (state == MED) {
            return "fan is on med";
        }
        return "invalid state";
    }
}
