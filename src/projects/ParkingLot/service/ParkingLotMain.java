package projects.ParkingLot.service;

import projects.ParkingLot.repository.*;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository= new ParkingLotRepositoryImpl();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepositoryImpl();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepositoryImpl();
        GateRepository gateRepository = new GateRepositoryImpl();

        InitService initService = new InitService(parkingLotRepository, parkingFloorRepository,parkingSpotRepository, gateRepository);

        //this init method will build our entire structure;
        initService.init();

    }

}
