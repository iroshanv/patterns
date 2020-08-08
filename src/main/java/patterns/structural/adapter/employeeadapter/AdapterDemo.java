package patterns.structural.adapter.employeeadapter;

import org.testng.annotations.Test;
import java.util.List;

public class AdapterDemo {

    @Test
    public void adapterDemo() {

        List<Employee> employees = EmployeeClient.getEmployeeList();
        Employee employeeDb = employees.get(0);
        Employee employeeLdap = employees.get(1);
        Employee employeeCsv = employees.get(2);

        System.out.println(employeeDb.getEmail());
        System.out.println(employeeLdap.getEmail());
        System.out.println(employeeCsv.getEmail());

    }
}
