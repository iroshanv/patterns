package patterns.structural.adapter.employeeadapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String first_name;
    private String last_name;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            first_name = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            last_name = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }


    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
