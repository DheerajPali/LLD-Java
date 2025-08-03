package projects.ParkingLot.model;

import projects.ParkingLot.model.constants.PaymentMode;
import projects.ParkingLot.model.constants.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private int amount;
    private String transactionNumber;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
    private Bill bill;
    private LocalDateTime paymentDateTime;

    public Payment() {
    }

    public Payment(int amount, Bill bill, LocalDateTime paymentDateTime, PaymentMode paymentMode, PaymentStatus paymentStatus, String transactionNumber) {
        this.amount = amount;
        this.bill = bill;
        this.paymentDateTime = paymentDateTime;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.transactionNumber = transactionNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }

    public void setPaymentDateTime(LocalDateTime paymentDateTime) {
        this.paymentDateTime = paymentDateTime;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }
}
