package designPattern.observer;


import java.util.ArrayList;
import java.util.List;

//publisher
public class OrderService {
    private List<OrderPlacedSubscriber> orderPlacedSubscriberList;

    public OrderService(){
        this.orderPlacedSubscriberList = new ArrayList<>();
    }

    public void placeOrder(){
        //order being placed --business logic
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscriberList){
            orderPlacedSubscriber.orderPlacedAction();
        }
    }

    public void add(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void remove(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }


}
