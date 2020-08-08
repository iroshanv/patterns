package patterns.behavioral.iterator;

import org.testng.annotations.Test;

import java.util.*;

public class IteratorEveryDayDemo {

    @Test
    public void iteratorEveryDayDemo() {
//        List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();
        names.add("bryan");
        names.add("aaron");
        names.add("jason");

   /*     for(int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }*/

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> namesItr = names.iterator();
        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }
        System.out.println("Names size: " + names.size());


    }
}
