package patterns.behavioral.template;

import org.testng.annotations.Test;

public class TemplateDemo {

    @Test
    public void templateDemo() {

        System.out.println("WEB ORDER");
        OrderTemplate weborder = new WebOrder();
        weborder.processOrder();

        System.out.println("---------------");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();


    }
}
