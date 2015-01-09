package org.varunshr.design.facade;

public class Computer {
	private CPU processor;
	private HardDrive hardDrive;
	private Memory ram;
	
	public Computer() {
		this.processor = new CPU();
		this.hardDrive = new HardDrive();
		this.ram = new Memory();
	}
	
	public void start() {
		processor.freeze();
		final String BOOT_LOCATION = hardDrive.read("BIOS");
		ram.load(BOOT_LOCATION);
		processor.jump(BOOT_LOCATION);
		processor.execute();
	}
}
