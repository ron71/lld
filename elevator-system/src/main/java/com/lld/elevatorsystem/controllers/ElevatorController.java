package com.lld.elevatorsystem.controllers;

import com.lld.elevatorsystem.models.Elevator;
import com.lld.elevatorsystem.models.Request;
import com.lld.elevatorsystem.strategies.DefaultElevatorSearchingStrategy;
import com.lld.elevatorsystem.strategies.ElevatorSearchingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ElevatorController {

    List<Elevator> elevators = new ArrayList<>();
    ElevatorSearchingStrategy elevatorSearchingStrategy = new DefaultElevatorSearchingStrategy();

    public ElevatorController(int nElevators, int capacity) {
        for(int i=1; i <= nElevators; i++){
            Elevator elevator = new Elevator(i, capacity);
            elevators.add(elevator);
            new Thread(elevator::run).start();
        }
    }

    public void requestElevator(int sourceFloor, int destinationFloor){
        Elevator elevator = elevatorSearchingStrategy.findElevator(elevators, sourceFloor);
        elevator.addRequest(new Request(sourceFloor, destinationFloor));
    }
}
