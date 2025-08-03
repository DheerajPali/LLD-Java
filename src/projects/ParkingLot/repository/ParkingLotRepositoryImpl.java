package projects.ParkingLot.repository;

import projects.ParkingLot.exception.ParkingLotNotFoundException;
import projects.ParkingLot.model.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepositoryImpl implements ParkingLotRepository {
    private HashMap <Integer,ParkingLot> parkingLotMap;
    private static int idCounter = 1;
    public ParkingLotRepositoryImpl() {
        this.parkingLotMap = new HashMap<>();
    }

    @Override
    public ParkingLot get(int parkingLotId){
       ParkingLot parkingLot = parkingLotMap.get(parkingLotId);
       if(parkingLot == null){
           throw new ParkingLotNotFoundException("Parking lot does not exist with id : " + parkingLotId);
       }
       return parkingLot;
    }

    @Override
    public void put(ParkingLot parkingLot) {
        parkingLot.setId(idCounter++);
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("ParkingLot has added successfully");
    }
}
