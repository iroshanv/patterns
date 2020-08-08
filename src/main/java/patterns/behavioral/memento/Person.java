package patterns.behavioral.memento;

public class Person {

    private String lastName;
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public PersonMemento save() {
        return new PersonMemento(firstName, lastName);
    }

    public void revert(PersonMemento personMemento) {
        firstName = personMemento.getFirstName();
        lastName = personMemento.getLastName();
    }
}
