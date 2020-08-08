package patterns.structural.adapter.employeeadapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB(
                "1",
                "rishi",
                "roshan",
                "rishi@earth.com");

        employees.add(employeeFromDB);

        // adapter 1
        EmployeeLdap employeeLdap = new EmployeeLdap(
                "2",
                "tanay",
                "roshan",
                "tanay@earth.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));


        // adapter 2
        EmployeeCSV employeeCSV = new EmployeeCSV(
                "567,sherlock,homes,sherlock@homes.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;

    }

}
