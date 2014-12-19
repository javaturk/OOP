package org.javaturk.oop.ch09.composition;

public class Car {
	private String make;
	private String model;
	private String year;
	private Wheel[] wheels = new Wheel[4];
	private Engine engine;
	private int doorCount;
	private Door[] doors;
	private Transmission transmission;

	private int speed;
	private int distance;

	public Car(String make, String model, String year, int doorCount) {
		this.make = make;
		this.model = model;
		this.year = year;

		engine = new Engine(2300, 175);

		transmission = new Transmission();

		wheels[0] = new Wheel("Left-front");
		wheels[1] = new Wheel("Right-front");
		wheels[2] = new Wheel("Left-rear");
		wheels[3] = new Wheel("Right-rear");

		this.doorCount = doorCount;
		doors = new Door[this.doorCount];
		doors[0] = new Door("Left-front");
		doors[1] = new Door("Right-front");
		
		if (this.doorCount == 4) {
			doors[2] = new Door("Left-rear");
			doors[3] = new Door("Right-rear");
		}

		System.out.println("A car of " + make + " " + model + ", " + year + " is created.\n");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Door[] getDoors() {
		return doors;
	}

	public void setDoors(Door[] doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public void start() {
		engine.start();
	}

	public void go(int newDistance) {
		for (Door door : doors) {
			if (!door.isClosed())
				door.close();
		}
		System.out.println("Car is moving.");
		distance += newDistance;
		System.out.println("Distance: " + distance);
	}

	public void accelerate(int newSpeed) {
		speed = newSpeed;
		System.out.println("Accelerating. Speed: " + speed);
	}

	public void stop() {
		speed = 0;
		System.out.println("Car stopped. Speed: " + speed);
	}

	public String getInfo() {
		return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at "
				+ speed + " kmph.";
	}
}
