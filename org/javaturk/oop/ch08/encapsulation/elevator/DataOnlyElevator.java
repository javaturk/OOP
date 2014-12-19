package org.javaturk.oop.ch08.encapsulation.elevator;

public class DataOnlyElevator {
    public byte currentFloor;
    public boolean doorOpen;

    public final int TOP_FLOOR = 7;
    public final int BOTTOM_FLOOR = -1;
    
    public void printInfo() {
        String doorStatus = null;
        if (doorOpen)
            doorStatus = "open";
        else
            doorStatus = "closed";

        System.out.println("Floor: " + currentFloor + " Door: " + doorStatus);
    }
}
