package org.varunshr.design.abstractFactory;

public class SuperBike extends Automobile {

	public SuperBike(AutomobileModel automobileModel, String name) {
		super(automobileModel, name);
		create();
	}
	
	@Override
	public void create() {
		System.out.println("Shipping Bike, Model : Superbike");
	}
}
