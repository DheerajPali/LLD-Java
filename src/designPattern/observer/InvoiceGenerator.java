package designPattern.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    @Override
    public void orderPlacedAction(){
        System.out.println("Generationg invoice for the order");
    }
}
