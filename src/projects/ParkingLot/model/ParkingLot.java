package projects.ParkingLot.model;

import projects.ParkingLot.model.constants.ParkingLotStatus;
import projects.ParkingLot.model.constants.VehicleType;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> parikingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypeSupported;
    private int capacity;
    private int occupiedSlots;

    public ParkingLot() {
    }

    public ParkingLot(String address, int capacity, String name, int occupiedSlots, List<ParkingFloor> parikingFloors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypeSupported) {
        this.address = address;
        this.capacity = capacity;
        this.name = name;
        this.occupiedSlots = occupiedSlots;
        this.parikingFloors = parikingFloors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParikingFloors() {
        return parikingFloors;
    }

    public void setParikingFloors(List<ParkingFloor> parikingFloors) {
        this.parikingFloors = parikingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypeSupported() {
        return vehicleTypeSupported;
    }

    public void setVehicleTypeSupported(List<VehicleType> vehicleTypeSupported) {
        this.vehicleTypeSupported = vehicleTypeSupported;
    }

    public int getOccupiedSlots() {
        return occupiedSlots;
    }

    public void setOccupiedSlots(int occupiedSlots) {
        this.occupiedSlots = occupiedSlots;
    }
}
