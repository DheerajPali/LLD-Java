package projects.ParkingLot.repository;

import projects.ParkingLot.model.ParkingSpot;

public interface ParkingSpotRepository {
    ParkingSpot get(int parkingSpotId);
    public void put(ParkingSpot parkingSpot);
}
