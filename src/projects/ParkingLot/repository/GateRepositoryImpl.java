package projects.ParkingLot.repository;

import projects.ParkingLot.exception.GateNotFoundException;
import projects.ParkingLot.model.Gate;

import java.util.HashMap;

public class GateRepositoryImpl implements GateRepository{
    private HashMap<Integer,Gate> gateMap;
    private static int idCounter = 1;

    public GateRepositoryImpl() {
        this.gateMap = new HashMap<>();
    }

    @Override
    public Gate get(int gateId) {
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found with id : " + gateId);
        }
        return gate;
    }

    @Override
    public void put(Gate gate) {
        gate.setId(idCounter++);
        gateMap.put(gate.getId(), gate);
    }
}
