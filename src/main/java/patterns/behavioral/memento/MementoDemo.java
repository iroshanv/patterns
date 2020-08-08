package patterns.behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Person person = new Person();

        person.setFirstName("rishi");
        person.setLastName("roshan");
        System.out.println("person before save : " + person);
        careTaker.save(person);

        person.setFirstName("tanay");
        careTaker.save(person);
        System.out.println("after changing name: " + person);

        person.setLastName("gowda"); // not saving
        careTaker.revert(person);
        System.out.println("revert to last save point: " + person);

        careTaker.revert(person);
        System.out.println("revert back to original: " + person);

    }

}
