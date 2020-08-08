package patterns.behavioral.strategy.everydaydemo;

import org.testng.annotations.Test;

import java.util.*;

public class StrategyEveryDayDemo {

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

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("\n sorted by age");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\n sorted by name");
        printContents(people);


    }
}
