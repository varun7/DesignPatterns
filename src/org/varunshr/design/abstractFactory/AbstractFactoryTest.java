package org.varunshr.design.abstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		
		// Create automobiles
		Automobile crusierBike = AutomobileFactory
				.buildAutomobile(AutomobileModel.CRUISER_BIKE);
		Automobile superBike = AutomobileFactory
				.buildAutomobile(AutomobileModel.SUPER_BIKE);
		Automobile sedanCar = AutomobileFactory
				.buildAutomobile(AutomobileModel.SEDAN_CAR);
		Automobile suvCar = AutomobileFactory
				.buildAutomobile(AutomobileModel.SUV_CAR);
		
		// Print the objects
		System.out.println(crusierBike);
		System.out.println(superBike);
		System.out.println(sedanCar);
		System.out.println(suvCar);
	}
}
