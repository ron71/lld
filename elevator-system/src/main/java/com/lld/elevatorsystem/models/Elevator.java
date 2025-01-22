package com.lld.elevatorsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Elevator {

    private final int id;
    private final int capacity;

    private int currentFloor;

    private final List<Request> requests = new ArrayList<>();

    private Direction direction;


    public Elevator(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.currentFloor = 1;
        this.direction = Direction.UP;
    }

    public synchronized void addRequest(Request request){
        if (requests.size() < capacity) {
            requests.add(request);
            System.out.println("Elevator " + id + " added request: " + request);
            notifyAll();
        }
    }

    private synchronized void processRequests(){
        while (true){
            while(!requests.isEmpty()){
                Request request = getNextRequest();
                processRequest(request);
            }
            try {
                System.out.println("Elevator: "+id+" processRequests: wait()");
                wait();
                System.out.println("Elevator: "+id+" processRequests: wait released");

            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private void processRequest(Request request) {
        int startFloor = currentFloor;
        int endFloor = request.getDestinationFloor();

        if(startFloor < endFloor){
            direction = Direction.UP;
            for(;startFloor< endFloor; startFloor++){
                System.out.println(String.format("Elevator %d is going %s from %d to %d.", id, direction, startFloor, endFloor));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }else if(startFloor > endFloor){
            direction = Direction.DOWN;
            for(;startFloor > endFloor; startFloor--){
                System.out.println(String.format("Elevator %d is going %s from %d to %d.", id, direction, startFloor, endFloor));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        currentFloor = endFloor;
    }

    private synchronized Request getNextRequest() {
        while (requests.isEmpty()){
            try {
                System.out.println("Elevator: "+id+" getNextRequest: wait()");
                wait();
                System.out.println("Elevator: "+id+" getNextRequest: wait released");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return requests.remove(0);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void run(){
        processRequests();
    }
}
