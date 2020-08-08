package patterns.behavioral.memento;

import java.util.Stack;

// care taker
public class CareTaker {

    private Stack<PersonMemento> personHistory = new Stack<>();

    public void save(Person person) {
        personHistory.push(person.save());
    }

    public void revert(Person person) {
        person.revert(personHistory.pop());
    }

}

