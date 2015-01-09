package org.varunshr.design.abstractFactory;

public class Suv extends Automobile {

	public Suv(AutomobileModel automobileModel, String name) {
		super(automobileModel, name);
		create();
	}

	@Override
	public void create() {
		System.out.println("Shipping Car, Model : SUV");
	}
}
