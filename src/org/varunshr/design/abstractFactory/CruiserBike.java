package org.varunshr.design.abstractFactory;

public class CruiserBike extends Automobile {

	public CruiserBike(AutomobileModel automobileModel, String name) {
		super(automobileModel, name);
		create();
	}

	@Override
	public void create() {
		System.out.println("Shipping Bike, Model : Cruiser bike");
	}
}
