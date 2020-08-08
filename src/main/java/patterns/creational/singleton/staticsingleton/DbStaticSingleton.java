package patterns.creational.singleton.staticsingleton;

public class DbStaticSingleton {

    private static DbStaticSingleton instance = new DbStaticSingleton();

    private DbStaticSingleton() {
    }

    public static DbStaticSingleton getInstance() {
        return instance;
    }
}


