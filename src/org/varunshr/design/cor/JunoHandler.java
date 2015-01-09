package org.varunshr.design.cor;

import com.google.common.base.Preconditions;

public class JunoHandler implements Chainable {

	private Chainable nextHandler;

	@Override
	public void setNext(Chainable nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(Request request) {
		Preconditions.checkNotNull(request);
		if (request.getDeviceType().equals("JUNO")) {
			System.out.println("JUNO : executing Juno request handler");
		} else {
			nextHandler.handleRequest(request);
		}
	}
}
