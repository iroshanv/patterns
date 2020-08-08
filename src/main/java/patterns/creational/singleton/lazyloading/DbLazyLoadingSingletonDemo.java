package patterns.creational.singleton.lazyloading;

import org.testng.annotations.Test;

public class DbLazyLoadingSingletonDemo {

    @Test
    public void dbSingletonDemo() {

        DbLazyLoadingSingleton instance = DbLazyLoadingSingleton.getInstance();
        DbLazyLoadingSingleton instance2 = DbLazyLoadingSingleton.getInstance();
        System.out.println(instance);
        System.out.println(instance2);

    }
}
