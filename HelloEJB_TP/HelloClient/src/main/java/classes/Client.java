package classes;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
	public static void main(String[] arg) throws NamingException {
		String jndiname = "HelloEJB/HelloService!classes.HelloServiceRemote";
		Context ctx = new InitialContext();
		HelloServiceRemote proxy = (HelloServiceRemote) ctx.lookup(jndiname);
		System.out.println(proxy.sayHello("hello"));
	}
}
