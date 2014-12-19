package org.javaturk.oop.ch08.encapsulation.elevator;

public class EncapsulatedElevatorTest {

    public static void main(String[] args) {
        System.out.println("Creating EncapsulatedElevator");
        
        EncapsulatedElevator elevator = new EncapsulatedElevator();

        elevator.openDoor();
        elevator.closeDoor();
        elevator.openDoor();
        elevator.goDown();
        elevator.goUp();
        elevator.goUp();
        elevator.openDoor();
        elevator.closeDoor();
        elevator.goDown();
        elevator.openDoor();
        elevator.goDown();
        elevator.openDoor();
        elevator.goDown();
        elevator.goDown();

        int curFloor = elevator.getFloor();

        if (curFloor != 5 && !elevator.getDoorStatus()) {
            elevator.setFloor(5);
        }

        elevator.setFloor(10);
        elevator.openDoor();
        
//        elevator.currentFloor = 19;
        
    }
}
