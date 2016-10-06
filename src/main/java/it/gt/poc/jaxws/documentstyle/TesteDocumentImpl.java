package it.gt.poc.jaxws.documentstyle;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "it.gt.poc.jaxws.documentstyle.TesteDocument")
public class TesteDocumentImpl implements TesteDocument {

	public String getComposedString(String param) {
		return " bla bla  " + param + " blu blu (" + System.getProperty("java.version") + ")";
	}

}
