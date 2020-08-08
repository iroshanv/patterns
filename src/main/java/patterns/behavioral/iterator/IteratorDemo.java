package patterns.behavioral.iterator;

import org.testng.annotations.Test;

import java.util.Iterator;

public class IteratorDemo {

    @Test
    public void iteratorDemo() {

        BikeRepository repository = new BikeRepository();
        repository.addBike("honda");
        repository.addBike("tvs");
        repository.addBike("bullet");

        Iterator<String> bikeIterator = repository.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for(String bike : repository) {
            System.out.println(bike);
        }

    }
}
