package patterns.creational.singleton.lazyloading;

public class DbLazyLoadingSingleton {

    private static DbLazyLoadingSingleton instance = null;

    private DbLazyLoadingSingleton() {}

    public static DbLazyLoadingSingleton getInstance() {

        if (instance == null) {
            instance = new DbLazyLoadingSingleton();
        }
        return instance;
    }
}


