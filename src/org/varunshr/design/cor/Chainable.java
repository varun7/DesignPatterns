package org.varunshr.design.cor;

public interface Chainable {
	public void setNext(Chainable nextHandler);
	public void handleRequest(Request request);
}
