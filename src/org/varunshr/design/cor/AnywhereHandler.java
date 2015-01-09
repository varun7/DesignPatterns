package org.varunshr.design.cor;

import com.google.common.base.Preconditions;

public class AnywhereHandler implements Chainable {

	private Chainable nextHandler;

	@Override
	public void setNext(Chainable nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(Request request) {
		Preconditions.checkNotNull(request);
		if (request.getDeviceType().equals("AW")) {
			System.out.println("Anywhere : executing Anywhere request handler");
		} else {
			nextHandler.handleRequest(request);
		}
	}
}
