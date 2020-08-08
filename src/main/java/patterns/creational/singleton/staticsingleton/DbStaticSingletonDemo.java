package patterns.creational.singleton.staticsingleton;

import org.testng.annotations.Test;

// static singleton or eagerly loaded single ton
public class DbStaticSingletonDemo {

    @Test
    public void dbSingletonDemo() {

        DbStaticSingleton instance = DbStaticSingleton.getInstance();
        DbStaticSingleton instance2 = DbStaticSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);

    }
}
