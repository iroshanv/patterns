package patterns.creational.prototype.everydaydemo;

import org.testng.annotations.Test;

public class PersonCloneDemo {

    @Test
    public void personCloneDemo() {
        Person person = new Person("rishi" , "age",
                new Address("bangalore", "560090"));
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress().getPinCode());
        System.out.println("shallow copy" + person.getAddress());

        Person clonePerson = person.clone();
        System.out.println(clonePerson.getFullName());
        System.out.println(clonePerson.getAge());
        System.out.println(clonePerson.getAddress().getPinCode());
        System.out.println("shallow copy" + clonePerson.getAddress());


    }
}

