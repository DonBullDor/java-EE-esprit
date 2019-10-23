package classes;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
	public static void main(String[] arg) throws NamingException {
		String jndiname = "HelloEJB/HelloService!classes.HelloServiceRemote";
		Context ctx = new InitialContext();
		//HelloServiceRemote proxy = (HelloServiceRemote) ctx.lookup(jndiname);
		HelloServiceLocal proxy = new HelloServiceLocal() {
			
			@Override
			public String sayHello(String msg) {
				// TODO Auto-generated method stub
				return msg;
			}
		};
		System.out.println(proxy.sayHello("hello"));
	}
}