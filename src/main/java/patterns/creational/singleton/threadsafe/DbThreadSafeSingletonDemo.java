package patterns.creational.singleton.threadsafe;

import org.testng.annotations.Test;

public class DbThreadSafeSingletonDemo {

    @Test
    public void dbSingletonDemo() {
        DbThreadSageSingleton instance = DbThreadSageSingleton.getInstance();


    }
}
