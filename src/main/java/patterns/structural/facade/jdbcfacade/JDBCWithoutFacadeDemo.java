package patterns.structural.facade.jdbcfacade;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc with out facade
 *
 */
public class JDBCWithoutFacadeDemo {

    @Test
    public void jDBCDemo() {
        try {

            Connection connection = DriverManager.getConnection("driver");
            Statement statement = connection.createStatement();
            int count = statement.executeUpdate("sql create table query");

            System.out.println("table created");
            statement.close();

            statement = connection.createStatement();
            count = statement.executeUpdate("sql insertion query");
            System.out.println(count + " record(s) created");
            statement.close();

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select sql query");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) +
                        resultSet.getString("2"));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
