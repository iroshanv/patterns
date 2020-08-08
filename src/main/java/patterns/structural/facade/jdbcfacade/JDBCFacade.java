package patterns.structural.facade.jdbcfacade;

import java.util.ArrayList;
import java.util.List;

public class JDBCFacade {

    DbSingleton instance = null;

    public JDBCFacade() {
        this.instance = DbSingleton.getInstance();
    }

    public int createTable() {
        // jdbc create table code goes here
        System.out.println("created table");
        return 1;
    }

    public int insertIntoTable() {
        // insert table to database goes here
        System.out.println("inserted table");
        return 1;
    }

    public List<Address> getAddress() {
        // select records from table code goes here
        System.out.println("getting list of address");
        Address address = new Address();
        address.setStreet("mg road");
        address.setPinCode(560010);

        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        return addresses;
    }

}
