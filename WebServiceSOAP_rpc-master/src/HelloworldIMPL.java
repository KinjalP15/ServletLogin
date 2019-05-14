import javax.jws.WebService;

@WebService(endpointInterface="HelloWorld")

public class HelloworldIMPL implements HelloWorld {
	@Override
	
	public String getHelloWorldAsString(String name) {
		
		return "Hey yoo world " + name;
	}

}
