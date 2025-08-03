package projects.ParkingLot.service.strategy.spotAllocationStrategy;

import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constants.ParkingSpotType;

public interface SpotAllocationStrategy {
    ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType);
}
