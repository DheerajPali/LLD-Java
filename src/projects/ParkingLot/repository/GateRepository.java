package projects.ParkingLot.repository;

import projects.ParkingLot.model.Gate;

public interface GateRepository {
    Gate get(int gateId);
    void put(Gate gate);
}
