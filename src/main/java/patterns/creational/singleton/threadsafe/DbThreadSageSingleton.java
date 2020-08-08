package patterns.creational.singleton.threadsafe;

public class DbThreadSageSingleton {

    private static volatile DbThreadSageSingleton instance = null;

    private DbThreadSageSingleton() {
        if (instance != null) {
            // to avoid reflection
            throw  new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbThreadSageSingleton getInstance() {

        if (instance == null) {
            synchronized (DbThreadSageSingleton.class) {
                if (instance == null) {
                    instance = new DbThreadSageSingleton();
                }
            }
        }

        return instance;
    }
}


