package patterns.behavioral.mediator;

public class Light {

    private boolean isOn = false;
    private String location;

    Light(){}
    public Light(String location) {
        this.location = location;
    }


    public boolean isOn(){
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        }else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("light switched on");
    }

    public void off() {
        System.out.println("light switched off");
    }
}

