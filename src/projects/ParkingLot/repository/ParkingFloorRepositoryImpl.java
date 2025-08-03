package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingFloorNotFoundException;
import projects.ParkingLot.model.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepositoryImpl implements ParkingFloorRepository{
    private HashMap<Integer,ParkingFloor> parkingFloorMap;
    private static int idCounter = 1;

    public ParkingFloorRepositoryImpl() {
        this.parkingFloorMap = new HashMap<>();
    }

    @Override
    public ParkingFloor get(int parkingFloorId) {
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            throw new ParkingFloorNotFoundException("ParkingFloor not found with id : " + parkingFloorId);
        }
        return parkingFloor;
    }

    @Override
    public void put(ParkingFloor parkingFloor) {
        parkingFloor.setId(idCounter++);
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
    }
}
