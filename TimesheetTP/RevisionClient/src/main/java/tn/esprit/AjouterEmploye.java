package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.Entity.Employee;
import tn.esprit.Entity.Role;
import tn.esprit.Service.EmployeServiceRemote;
public class AjouterEmploye {

	public static void main(String[] args) {
		String jndiName="/Revision-ear/Revision-ejb/EmployeService!tn.esprit.Service.EmployeServiceRemote";
		Context context ;
		try {
			context = (Context) new InitialContext();
			Role x = Role.ingenieur ;
			EmployeServiceRemote proxy =(EmployeServiceRemote) context.lookup(jndiName);
			Employee e = new Employee("Ahmed","Ghannouchi","ahmed.ghannouchi@esprit.tn",true,x,"123456789");
			proxy.ajouterEmploye(e);
			
			
		} catch (NamingException e) {
			System.out.println(e.getMessage());
		}

	}

}
