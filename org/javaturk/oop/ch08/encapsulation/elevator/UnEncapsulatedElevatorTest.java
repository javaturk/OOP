package org.javaturk.oop.ch08.encapsulation.elevator;

public class UnEncapsulatedElevatorTest {

    public static void main(String[] args) {
        System.out.println("Creating UnEncapsulatedElevator");
        UnEncapsulatedElevator elevator = new UnEncapsulatedElevator();
        
        // At floor 0 and waiting
        elevator.setFloor(0);
        elevator.closeDoor();
        elevator.printInfo();
        
        // Loading for floor 5 but door is open
        elevator.openDoor();
        elevator.setFloor(5);
        elevator.closeDoor();
        elevator.setFloor(5);
        elevator.printInfo();
        elevator.openDoor();
        elevator.closeDoor();
        
        elevator.setFloor(0);
        elevator.printInfo();
        
        // How about these?
        elevator.setFloor(9);
        elevator.setFloor(-2);
        
//        And still
        elevator.doorOpen = false;
        elevator.currentFloor = 5;
        elevator.currentFloor = 12;
        elevator.currentFloor = -4;
    }
}
