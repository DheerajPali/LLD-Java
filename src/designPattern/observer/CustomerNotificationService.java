package designPattern.observer;

public class CustomerNotificationService implements OrderPlacedSubscriber {

    @Override
    public void orderPlacedAction(){
        System.out.println("Customer is being notified by something");
    }
}
