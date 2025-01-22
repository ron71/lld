package com.lld.elevatorsystem;

import com.lld.elevatorsystem.controllers.ElevatorController;

public class App {
    public static void main(String[] args) {
        ElevatorController elevatorController = new ElevatorController(3,5);

        elevatorController.requestElevator(2,5);
        elevatorController.requestElevator(4,1);
        elevatorController.requestElevator(1,5);
    }
}
