package projects.ParkingLot.service.strategy.spotAllocationStrategy;

public class SpotAllocationStrategyFactory {

    public static SpotAllocationStrategy getSpotAllocationStrategy(AllocationStrategy allocationStrategy){
        //Here we'll implement factory
         return switch (allocationStrategy){
             case LINEAR -> new LinearParkingSpotAllocationStrategy();
             case SPOT_TYPE -> null;
             case NEAR_EXIT -> null;
         };
    }

}
