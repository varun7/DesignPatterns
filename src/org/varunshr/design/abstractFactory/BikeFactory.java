package org.varunshr.design.abstractFactory;

/**
 * Factory for building bikes.
 * 
 * @author varunshr
 * 
 */
public class BikeFactory {
	public static Automobile buildBike(AutomobileModel automobileModel) {
		switch (automobileModel) {
		case SUPER_BIKE:
			return new SuperBike(automobileModel, "My SuperBike");
		case CRUISER_BIKE:
			return new CruiserBike(automobileModel, "My CruiserBike");
		default:
			return new SuperBike(automobileModel, "No Name");
		}
	}
}
