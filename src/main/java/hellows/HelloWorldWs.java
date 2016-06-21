package hellows;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService

public class HelloWorldWs {
	
	@WebMethod
	
	public String sayHello()
	{
		return "Hello World!";
	}

}
