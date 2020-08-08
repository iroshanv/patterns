package patterns.behavioral.memento.everydayexample;

import java.io.*;

public class MementoEverydayDemo {

    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) inputStream.readObject();
            inputStream.close();
            fileInputStream.close();
        }catch (Exception e) {

        }

        return employee;
    }

    private static void serialize(Employee employee) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("roshan");
        employee.setID("007");

        serialize(employee);
        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());

    }
}
