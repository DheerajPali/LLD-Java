package projects.ParkingLot.service.strategy.spotAllocationStrategy;

import projects.ParkingLot.exception.NoAvailableParkingSpotException;
import projects.ParkingLot.model.ParkingFloor;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.Vehicle;
import projects.ParkingLot.model.constants.ParkingSpotStatus;
import projects.ParkingLot.model.constants.ParkingSpotType;

public class LinearParkingSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkingLot, Vehicle vehicle, ParkingSpotType parkingSpotType) {
        for(ParkingFloor floor : parkingLot.getParikingFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)
                && spot.getVehicleType().equals(vehicle.getVehicleType())){
                    return spot;
                }
            }
        }
        throw new NoAvailableParkingSpotException("Parking lot is full");
    }
}
