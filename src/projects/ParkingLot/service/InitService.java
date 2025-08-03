package projects.ParkingLot.service;

import projects.ParkingLot.model.Gate;
import projects.ParkingLot.model.ParkingFloor;
import projects.ParkingLot.model.ParkingLot;
import projects.ParkingLot.model.ParkingSpot;
import projects.ParkingLot.model.constants.GateType;
import projects.ParkingLot.model.constants.ParkingLotStatus;
import projects.ParkingLot.model.constants.ParkingSpotStatus;
import projects.ParkingLot.model.constants.VehicleType;
import projects.ParkingLot.repository.GateRepository;
import projects.ParkingLot.repository.ParkingFloorRepository;
import projects.ParkingLot.repository.ParkingLotRepository;
import projects.ParkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitService {
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitService(ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository, GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        ParkingLot parkingLot = new ParkingLot();
//        parkingLot.setId(1);
        parkingLot.setName("WhiteEagle ParkingLot");
        parkingLot.setAddress("small town in MadhyaPradesh");
        parkingLot.setCapacity(100);
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setVehicleTypeSupported(List.of(VehicleType.EV,VehicleType.TWO_WHEELER,VehicleType.FOUR_WHEELER,VehicleType.LUXE));

        //Now I'll create floors, which will be added in my parking lot.
        ArrayList<ParkingFloor> floors = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
//            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            List<ParkingSpot> spots = new ArrayList<>();

            //for each floor 10 parking spot object
            for(int j = 0; j < 4; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            for(int j = 4; j < 8; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.TWO_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            for(int j = 8; j < 9; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.EV);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            for(int j = 9; j < 10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setNumber((i*100)+j);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.LUXE);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            parkingFloor.setParkingSpots(spots);

            //creating entry gate object
            Gate entryGate = new Gate();
            entryGate.setId((i*100)+1);
            entryGate.setGateNumber((i*100)+1);
            entryGate.setGateType(GateType.ENTRY_GATE);
            entryGate.setOperatorName("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            //creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*100)+2);
            exitGate.setGateNumber((i*100)+1);
            exitGate.setGateType(GateType.EXIT_GATE);
            exitGate.setOperatorName("Operator : " + i + 2);
            parkingFloor.setEntryGate(exitGate);
            gateRepository.put(exitGate);

            parkingFloor.setEntryGate(entryGate);
            parkingFloor.setExitGate(exitGate);

            floors.add(parkingFloor);

            parkingFloorRepository.put(parkingFloor);
        }

        parkingLot.setParikingFloors(floors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);

    }
}
