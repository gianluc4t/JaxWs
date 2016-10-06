package it.gt.poc.jaxws.rpcstyle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC) //optional
public interface TesteRpc {

		@WebMethod public String getComposedString(String param);
	}

