package org.varunshr.design.adapter;

public class Car implements Vehichle {

	@Override
	public void start() {
		System.out.println("Car: Ignition on");
	}

	@Override
	public void drive() {
		System.out.println("Car: Moving");
	}

	@Override
	public void stop() {
		System.out.println("Car: Stop");
	}

}
