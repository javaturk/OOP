package org.javaturk.oop.ch08.encapsulation.elevator;

/**
 * What is still wrong with this Elevator?
 */

public class UnEncapsulatedElevator {

    public int currentFloor;
    public boolean doorOpen;

    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = -1;


    public void openDoor() {
        System.out.println("Opening door.");
        doorOpen = true;
        System.out.println("Door is open.");
    }

    public void closeDoor() {
        System.out.println("Closing door.");
        doorOpen = false;
        System.out.println("Door is closed.");
    }

    public void goUp() {
        System.out.println("Going up one floor.");
        currentFloor++;
        System.out.println("Floor: " + currentFloor);
    }

    public void goDown() {
        System.out.println("Going down one floor.");
        currentFloor--;
        System.out.println("Floor: " + currentFloor);
    }

    public void setFloor(int newFloor) {
        currentFloor = newFloor;
    }

    public int getFloor() {
        return currentFloor;
    }

    public boolean checkDoorStatus() {
        return doorOpen;
    }
    
    public void printInfo() {
        String doorStatus = null;
        if (checkDoorStatus())
            doorStatus = "open";
        else
            doorStatus = "closed";

        System.out.println("Floor: " + currentFloor + " Door: " + doorStatus);
    }
}
