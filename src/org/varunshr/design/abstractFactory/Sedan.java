package org.varunshr.design.abstractFactory;

public class Sedan extends Automobile {
	public Sedan(AutomobileModel automobileModel, String name) {
		super(automobileModel, name);
		create();
	}

	@Override
	public void create() {
		System.out.println("Shipping Car, Model : Sedan");
	}
}
