package projects.ParkingLot.repository;

import projects.ParkingLot.model.ParkingFloor;

public interface ParkingFloorRepository {
    ParkingFloor get(int parkingFloorId);
    void put(ParkingFloor parkingFloor);
}
