package patterns.structural.adapter.everydaydemo;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AdapterEveryDayDemo {

    @Test
    public void adapterEveryDayDemo() {
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }

}
