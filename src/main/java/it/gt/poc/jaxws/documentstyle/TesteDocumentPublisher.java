package it.gt.poc.jaxws.documentstyle;

import javax.xml.ws.Endpoint;


public class TesteDocumentPublisher {


	public static void main(String[] args) {
		
		System.out.println(" Start testeDOCUMENT (" + System.getProperty("java.version") + ")");
		   Endpoint.publish("http://localhost:9998/testeDOCUMENT", new TesteDocumentImpl());

	}
	
}
