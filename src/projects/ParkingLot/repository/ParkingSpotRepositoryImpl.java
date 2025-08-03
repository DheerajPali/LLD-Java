package projects.ParkingLot.repository;

import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.exception.ParkingSpotNotFoundException;
import java.util.HashMap;

public class ParkingSpotRepositoryImpl implements ParkingSpotRepository {
    private HashMap<Integer,ParkingSpot> parkingSpotMap;
    private static int idCounter = 1;

    public ParkingSpotRepositoryImpl() {
        this.parkingSpotMap = new HashMap<>();
    }

    @Override
    public ParkingSpot get(int parkingSpotId) {
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null){
            throw new ParkingSpotNotFoundException("Parking slot does not exist with id : " + parkingSpotId);
        }

        return parkingSpot;
    }

    @Override
    public void put(ParkingSpot parkingSpot) {
        parkingSpot.setId(idCounter++);
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
    }
}
