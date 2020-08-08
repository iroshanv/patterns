package patterns.structural.facade.jdbcfacade;

import org.testng.annotations.Test;

public class JDBCFacadeDemo {

    @Test
    public void JDBCFacadeDemo() {

        JDBCFacade jdbcFacade = new JDBCFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
       for (Address address: jdbcFacade.getAddress()) {
           System.out.println(address.getStreet() + ":" + address.getPinCode());
       }

    }
}

