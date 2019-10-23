package classes;

import javax.ejb.Stateless;

@Stateless
public class HelloService implements HelloServiceLocal,HelloServiceRemote {
	public String sayHello(String msg){
		return msg;
	}
}
