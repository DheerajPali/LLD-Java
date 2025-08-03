package projects.ParkingLot.service.strategy.billCalculationStrategy;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SurgeBillCalculationStrategy implements BillCalculationStrategy{
    private static final   int BASIC_RATE = 50;
    private static final int HOURLY_RATE = 40;
    private static final double L1_SURGE = 1.2; //50% spots occupied
    private static final double L2_SURGE = 1.65; //75% filled
    private static final double L3_SURGE = 2; // 90% filled

    @Override
    public double calculateAmount(ParkingLot parkingLot, Ticket ticket) {
        double amount = this.calculateLinearBillAmount(ticket);

        double occupancyRate = (double) parkingLot.getOccupiedSlots() /parkingLot.getCapacity();
        if(occupancyRate >= 0.5 && occupancyRate < 0.75){
            amount *= L1_SURGE;
        } else if (occupancyRate >= 0.75 && occupancyRate < 0.9) {
            amount *= L2_SURGE;
        } else{
            amount *= L3_SURGE;
        }

        return amount;
    }

    private double calculateLinearBillAmount(Ticket ticket){
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        boolean basicRateCalculated = false;
        double amount = 0;

        Long numOfSeconds = ChronoUnit.SECONDS.between(entryTime,exitTime);
        while(numOfSeconds > 0){
            if(!basicRateCalculated){
                amount += BASIC_RATE;
                basicRateCalculated = true;
            }
            else {
                amount += HOURLY_RATE;
            }
            numOfSeconds -= 36000;
        }

        return amount;
    }
}
