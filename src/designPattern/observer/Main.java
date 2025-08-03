package designPattern.observer;

public class Main {
    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        SendEmailService sendEmail = new SendEmailService();
        OrderService orderService = new OrderService();

        orderService.add(invoiceGenerator);
        orderService.add(sendEmail);
        orderService.add(customerNotificationService);
        orderService.placeOrder();
        orderService.placeOrder();
//        orderService.remove(sendEmail);
        orderService.placeOrder();
    }
}
