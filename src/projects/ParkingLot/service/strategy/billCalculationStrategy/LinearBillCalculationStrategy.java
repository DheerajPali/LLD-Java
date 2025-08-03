package projects.ParkingLot.service.strategy.billCalculationStrategy;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.Ticket;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LinearBillCalculationStrategy implements BillCalculationStrategy{
    private static  int BASIC_RATE = 50;
    private static int HOURLY_RATE = 40;

    public double calculateAmount(ParkingLot parkingLot, Ticket ticket) {
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();
        boolean basicRateCalculated = false;
        double amount = 0;

        Long numOfSeconds = ChronoUnit.SECONDS.between(entryTime, exitTime);
        while (numOfSeconds > 0) {
            if (!basicRateCalculated) {
                amount += BASIC_RATE;
                basicRateCalculated = true;
            } else {
                amount += HOURLY_RATE;
            }
            numOfSeconds -= 36000;
        }

        return amount;
    }

}
