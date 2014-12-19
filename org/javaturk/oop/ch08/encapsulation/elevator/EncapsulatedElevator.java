package org.javaturk.oop.ch08.encapsulation.elevator;

public class EncapsulatedElevator {

    private int currentFloor;
    private boolean doorOpen;

    private int weight = 0;

    private final int CAPACITY = 1000;
    private final int TOP_FLOOR = 5;
    private final int BOTTOM_FLOOR = 1;

    public void openDoor() {
        doorOpen = true;
        System.out.println("Door is open.");
    }


    public void closeDoor() {
        calculateWeight();

        if (weight <= CAPACITY) {
            doorOpen = false;
            System.out.println("Door is closed.");
        } else {
            System.out.println("The elevator has exceeded capacity.");
            System.out.println("Doors will remain open until someone exits!");
        }
    }

    // In reality, the elevator would have weight sensors to
    // check the actual weight in the elevator, but for the sake
    // of simplicity we just pick a random number to represent the
    // weight in the elevator

    private void calculateWeight() {
        weight = (int)(Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }

    public void goUp() {
        if (!doorOpen) {
            if (currentFloor < TOP_FLOOR) {
                currentFloor++;
                System.out.println(currentFloor);
            } else {
                System.out.println("On top floor.");
                openDoor();
            }
        } else {
            System.out.println("Doors are closing!");
            closeDoor();
        }
    }

    public void goDown() {
        if (!doorOpen) {
            if (currentFloor > BOTTOM_FLOOR) {
                currentFloor--;
                System.out.println(currentFloor);
            } else {
                System.out.println("Already on bottom floor.");
            }
        } else {
            System.out.println("Doors still open!");
        }
    }

    public void setFloor(int desiredFloor) {
        if ((desiredFloor >= BOTTOM_FLOOR) && (desiredFloor <= TOP_FLOOR)) {

            while (currentFloor != desiredFloor) {
                if (currentFloor < desiredFloor) {
                    goUp();
                }

                else {
                    goDown();
                }
            }
        } else {
            System.out.println("Invalid Floor");
        }
    }

    public int getFloor() {
        return currentFloor;
    }

    public boolean getDoorStatus() {
        return doorOpen;
    }
}
