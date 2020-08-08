package patterns.behavioral.template.everydaydemo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TemplateEveryDayDemo {

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    @Test
    public void strategyEveryDayDemo() {

        Person rishi = new Person(5, "rishi", "009");
        Person tanay = new Person(1, "tanay", "007");
        Person gundu = new Person(2, "gundu","001");

        List<Person> people = new ArrayList<Person>();
        people.add(rishi);
        people.add(tanay);
        people.add(gundu);

        System.out.println("not sorted");
        printContents(people);

        System.out.println("\nsorted by age");
        Collections.sort(people);
        printContents(people);

    }
}
