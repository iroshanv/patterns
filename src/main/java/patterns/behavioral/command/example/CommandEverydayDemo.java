package patterns.behavioral.command.example;

import org.testng.annotations.Test;

public class CommandEverydayDemo {

    @Test
    public void commandEverydayDemo() {
        Task task1 = new Task(10, 12);
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        thread1.start(); // invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }



}
