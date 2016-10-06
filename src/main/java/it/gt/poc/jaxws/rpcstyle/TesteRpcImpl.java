package it.gt.poc.jaxws.rpcstyle;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "it.gt.poc.jaxws.rpcstyle.TesteRpcImpl")
public class TesteRpcImpl implements TesteRpc {


	public String getComposedString(String param) {
		return " bla bla  " + param + " blu blu (" + System.getProperty("java.version") + ")";
	}

}
