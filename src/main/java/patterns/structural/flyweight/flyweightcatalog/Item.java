package patterns.structural.flyweight.flyweightcatalog;

// Instances of item will be the flyweights - intrinsic values
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
