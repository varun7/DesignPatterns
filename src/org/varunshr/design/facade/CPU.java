package org.varunshr.design.facade;

public class CPU {
	public void freeze() {
		System.out.println("CPU\t\t: freeze state");
	}

	public void jump(String location) {
		System.out.println("CPU\t\t: control shifted to address : " + location);
	}

	public void execute() {
		System.out.println("CPU\t\t: executing instruction at current location");
	}
}
