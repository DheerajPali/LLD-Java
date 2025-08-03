package projects.ParkingLot.repository;

import projects.ParkingLot.model.ParkingLot;

public interface ParkingLotRepository {
    ParkingLot get(int parkingLotId);
    void put(ParkingLot parkingLot);
}
