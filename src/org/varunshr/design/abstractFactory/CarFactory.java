package org.varunshr.design.abstractFactory;

/**
 * Factory for building cars.
 * 
 * @author varunshr
 * 
 */
public class CarFactory {
	public static Automobile buildCar(AutomobileModel automobileModel) {
		switch (automobileModel) {
		case SEDAN_CAR:
			return new Sedan(automobileModel, "My Sedan");
		case SUV_CAR:
			return new Suv(automobileModel, "My SUV");
		default:
			return new Sedan(automobileModel, "No Name");
		}
	}
}
