package designPattern.observer;

public class SendEmailService implements OrderPlacedSubscriber{
    public void orderPlacedAction(){
        System.out.println("Your order has placed - email");
    }
}
