package org.varunshr.design.abstractFactory;

/**
 * This is the base class for all automobiles manufactured by the company.
 * 
 * @author varunshr
 * 
 */
public abstract class Automobile {
	AutomobileModel automobileModel;
	String name;

	/**
	 * To be overriden by inheriting classes.
	 */
	public abstract void create();

	public Automobile(AutomobileModel automobileModel, String name) {
		this.automobileModel = automobileModel;
		this.name = name;
	}

	public AutomobileModel getautomobileModel() {
		return automobileModel;
	}

	public void setautomobileModel(AutomobileModel automobileModel) {
		this.automobileModel = automobileModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "\n\nModel \t: " + automobileModel.toString() + "\nName \t: " + name; 
	}
}
