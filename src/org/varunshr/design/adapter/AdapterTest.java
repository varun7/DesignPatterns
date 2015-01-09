package org.varunshr.design.adapter;

public class AdapterTest {
	
	public static void main (String [] args) {
		Car car = new Car();
		Bike bike = new Bike();
		BikeAdapter bikeAdapter = new BikeAdapter(bike);
		
		car.start();
		car.drive();
		car.stop();
		
		bikeAdapter.start();
		bikeAdapter.drive();
		bikeAdapter.stop();
	}
}
