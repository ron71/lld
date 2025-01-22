package com.lld.elevatorsystem.strategies;

import com.lld.elevatorsystem.models.Elevator;

import java.util.Comparator;
import java.util.List;

public class DefaultElevatorSearchingStrategy implements ElevatorSearchingStrategy {
    @Override
    public Elevator findElevator(List<Elevator> elevatorList, int sourceFloor) {
        Elevator optimalElevator=null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator elevator : elevatorList){
            if(Math.abs(elevator.getCurrentFloor()-sourceFloor)<minDistance){
                minDistance = Math.abs(elevator.getCurrentFloor()-sourceFloor);
                optimalElevator = elevator;
            }
        }
        return optimalElevator;

//        return elevatorList.stream().min(Comparator.comparingInt(el -> Math.abs(el.getCurrentFloor() - sourceFloor))).orElse(null);
    }
}
