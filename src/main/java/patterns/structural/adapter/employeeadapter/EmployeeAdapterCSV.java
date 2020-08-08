package patterns.structural.adapter.employeeadapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirst_name();
    }

    @Override
    public String getLastName() {
        return instance.getLast_name();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
