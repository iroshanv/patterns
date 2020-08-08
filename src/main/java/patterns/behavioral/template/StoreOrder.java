package patterns.behavioral.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("ring up items from card");
    }

    @Override
    public void doPayment() {
        System.out.println("process payment with card present");
    }

    @Override
    public void doReceipt() {
        System.out.println("print receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("bag items at counter");
    }
}
