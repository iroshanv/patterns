package patterns.behavioral.template;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("get items from cart");
        System.out.println("set gift preferences");
        System.out.println("set delivery address");
        System.out.println("set billing address");
    }

    @Override
    public void doPayment() {
        System.out.println("process payment without card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("email receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("ship the item to address");
    }
}
