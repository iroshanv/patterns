package patterns.behavioral.mediator.everydaydemo;

import java.util.Timer;
import java.util.TimerTask;

public class RemindTaskWithOutBeep extends TimerTask {

    private Timer timer;
    RemindTaskWithOutBeep(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("Now Time's really up");
        timer.cancel();
    }
}
