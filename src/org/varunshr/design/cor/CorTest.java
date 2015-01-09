package org.varunshr.design.cor;

public class CorTest {
	public static void main (String [] args) {
		Chainable tosHandler = new TosHandler();
		Chainable junoHandler = new JunoHandler();
		Chainable anywhereHandler = new AnywhereHandler();
		Chainable defaultHandler = new DefaultHandler();
		
		tosHandler.setNext(junoHandler);
		junoHandler.setNext(anywhereHandler);
		anywhereHandler.setNext(defaultHandler);
		
		tosHandler.handleRequest(new Request("TOS"));
		tosHandler.handleRequest(new Request("JUNO"));
		tosHandler.handleRequest(new Request("AW"));
		tosHandler.handleRequest(new Request("XYML"));
	}
}
