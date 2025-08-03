package projects.ParkingLot.model;

import projects.ParkingLot.model.constants.VehicleType;

public class Vehicle extends BaseModel{
    private String VehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        VehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public Vehicle() {
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
