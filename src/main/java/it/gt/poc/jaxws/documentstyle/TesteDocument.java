package it.gt.poc.jaxws.documentstyle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, use= Use.LITERAL) //optional
public interface TesteDocument {

	@WebMethod public String getComposedString(String param);
}