package patterns.structural.flyweight.flyweightcatalog;

import java.util.HashMap;
import java.util.Map;

// catalog acts as factory and cache for item flyweight objects
public class Catalog {

    private Map<String, Item> itemMap = new HashMap<>();

    //factory method
    public Item lookup(String itemName) {
        if (!itemMap.containsKey(itemName)) {
            itemMap.put(itemName, new Item(itemName));
        }
        return itemMap.get(itemName);
    }

    public int totalItemsMade() {
        return itemMap.size();
    }


}
