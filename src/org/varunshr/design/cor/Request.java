package org.varunshr.design.cor;

public class Request {
	private String deviceType;
	
	public Request(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
