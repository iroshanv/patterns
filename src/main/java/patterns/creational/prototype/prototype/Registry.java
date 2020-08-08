package patterns.creational.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> itemsReg = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItems(String type) {
        Item item = null;

        try{
            item = (Item) itemsReg.get(type).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("just a movie");
        movie.setRunTime("2.30hrs");
        movie.setPrice(500);
        itemsReg.put("movie", movie);

        Book book = new Book();
        book.setNumberOfPages(334);
        book.setPrice(340);
        book.setTitle("just a book");
        itemsReg.put("book", book);

    }
}
