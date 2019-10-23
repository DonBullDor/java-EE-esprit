package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.Entity.Departement;
import tn.esprit.Service.RevisionServiceRemote;
public class AjouterDepartement {

	public static void main(String[] args) {
		String jndiName="/Revision-ear/Revision-ejb/RevisionService!tn.esprit.Service.RevisionServiceRemote";
		Context context ;
		try {
			context = (Context) new InitialContext();
			RevisionServiceRemote proxy =(RevisionServiceRemote) context.lookup(jndiName);
			Departement e = new Departement("Devlp");
			proxy.ajouterDepartement(e);
			
			
		} catch (NamingException e) {
			System.out.println(e.getMessage());
		}

	}

}
