package designPattern.observer;

// any class which implementing this interface would become
// subscriber to order placed event, and would trigger orderPlacedAction

public interface OrderPlacedSubscriber {
    void orderPlacedAction();
}
