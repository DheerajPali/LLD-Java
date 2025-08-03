package projects.ParkingLot.service.strategy.billCalculationStrategy;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.Ticket;

public interface BillCalculationStrategy {
//    public Bill calculateBill(ParkingLot parkingLot, Ticket ticket);
    public double calculateAmount(ParkingLot parkingLot, Ticket ticket);

}
