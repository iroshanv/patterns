package patterns.behavioral.mediator.everydaydemo;

import java.util.Timer;

public class MediatorEveryDayDemo {

    private Timer timer;

    public MediatorEveryDayDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        timer.schedule(new RemindTaskWithOutBeep(timer), seconds * 2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println("About to set schedule task");
        new MediatorEveryDayDemo(3);
        System.out.println("Task scheduled");
    }


}
