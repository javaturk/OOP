package org.javaturk.oop.ch08.encapsulation.elevator;

/**
 * What is wrong with this approach?
 */

public class DataOnlyElevatorTest {
    
    public static void main(String[] args) {
        System.out.println("Creating DataOnlyElevator");
        DataOnlyElevator elevator = new DataOnlyElevator();
        
        elevator.printInfo();
        // At floor 0 and waiting
        elevator.currentFloor = -124;
        elevator.doorOpen = false;
        elevator.printInfo();
        
        // Loading for floor 5
        elevator.doorOpen = true;
        elevator.printInfo();
//        elevator.doorOpen = false;
        elevator.currentFloor = 5;
        elevator.printInfo();
        elevator.doorOpen = true;
        elevator.doorOpen = false;
        
        elevator.currentFloor = 0;
        elevator.printInfo();
        
        elevator.currentFloor = 12;
        elevator.currentFloor = -4;
    }
}
