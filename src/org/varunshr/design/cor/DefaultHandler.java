package org.varunshr.design.cor;

public class DefaultHandler implements Chainable {

	@Override
	public void setNext(Chainable nextHandler) {
		System.out.println("This is default handler");
	}

	@Override
	public void handleRequest(Request request) {
		System.out.println("Default: No handler defined for request : "
				+ request.toString());
	}

}
