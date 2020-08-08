package patterns.behavioral.mediator.everydaydemo;

import java.util.TimerTask;

public class RemindTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Beep Beep: Time Up");
    }
}
