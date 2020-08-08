package patterns.structural.facade.jdbcfacade;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {

    private static DbSingleton dbSingleton = new DbSingleton();

    private DbSingleton() {
    }

    public static DbSingleton getInstance(){
        return dbSingleton;
    }

    public  Connection getConnection() {
        try {
            return DriverManager.getConnection("driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
