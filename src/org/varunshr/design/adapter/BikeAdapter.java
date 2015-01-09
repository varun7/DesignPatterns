package org.varunshr.design.adapter;

import com.google.common.base.Preconditions;

public class BikeAdapter implements Vehichle {

	private Bike bike;
	
	public BikeAdapter(Bike bike) {
		Preconditions.checkNotNull(bike);
		this.bike = bike;
	}
	
	@Override
	public void start() {
		bike.kickStart();
	}

	@Override
	public void drive() {
		bike.move();
	}

	@Override
	public void stop() {
		bike.halt();
	}

}
