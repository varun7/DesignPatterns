package org.varunshr.design.facade;

public class HardDrive {
	public String read(String location) {
		System.out.println("HardDrive\t: Reading data from disk, "
				+ location + " Address is OXFFFFFFF");
		return "OXFFFFFFF";
	}
}
