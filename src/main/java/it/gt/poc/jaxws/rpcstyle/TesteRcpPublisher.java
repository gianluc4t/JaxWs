package it.gt.poc.jaxws.rpcstyle;

import javax.xml.ws.Endpoint;

public class TesteRcpPublisher {
	public static void main(String[] args) {
		
		System.out.println(" Start testeRPC (" + System.getProperty("java.version") + ")");
		   Endpoint.publish("http://localhost:9999/testeRPC", new TesteRpcImpl());

	}
}
