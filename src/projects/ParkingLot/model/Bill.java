package projects.ParkingLot.model;

import projects.ParkingLot.model.constants.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private BillStatus billStatus;
    private Ticket ticket;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(double amount, BillStatus billStatus, Gate exitGate, LocalDateTime exitTime, Ticket ticket) {
        this.amount = amount;
        this.billStatus = billStatus;
        this.exitGate = exitGate;
        this.exitTime = exitTime;
        this.ticket = ticket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
