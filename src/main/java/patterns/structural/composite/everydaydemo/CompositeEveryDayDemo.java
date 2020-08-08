package patterns.structural.composite.everydaydemo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CompositeEveryDayDemo {

    @Test
    public void compositeEveryDayDemo() {

        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String, String> secAttributes = new HashMap<>();
        // composite all
        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);

    }
}
