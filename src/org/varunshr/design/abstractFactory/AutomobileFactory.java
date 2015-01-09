package org.varunshr.design.abstractFactory;

import com.google.common.base.Preconditions;

/**
 * Factory class to submit a request for building automobile.
 * 
 * @author varunshr
 * 
 */
public class AutomobileFactory {

	/**
	 * If user asked for SEDAN/SUV (car) then ask car factory to build a car of
	 * model mentioned by the user.
	 * 
	 * If user asked for CRUISER/SUPER (bike) then ask Bike factory to build a
	 * bike of model mentioned by the user.
	 * 
	 * @param automobileModel
	 */
	public static Automobile buildAutomobile(AutomobileModel automobileModel) {
		Preconditions.checkNotNull(automobileModel);
		AutomobileType automobileType;

		switch (automobileModel) {
		case SEDAN_CAR:
			automobileType = AutomobileType.CAR;
			break;
		case SUV_CAR:
			automobileType = AutomobileType.CAR;
			break;
		case CRUISER_BIKE:
			automobileType = AutomobileType.BIKE;
			break;
		case SUPER_BIKE:
			automobileType = AutomobileType.BIKE;
			break;
		default:
			automobileType = AutomobileType.BIKE;
			break;
		}

		// invoke corresponding factory.
		if (automobileType == AutomobileType.BIKE) {
			return BikeFactory.buildBike(automobileModel);
		} else {
			return CarFactory.buildCar(automobileModel);
		}
	}
}
