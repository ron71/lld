package com.lld.elevatorsystem.strategies;

import com.lld.elevatorsystem.models.Elevator;

import java.util.List;

public interface ElevatorSearchingStrategy {
    Elevator findElevator(List<Elevator> elevatorList, int sourceFloor);
}
