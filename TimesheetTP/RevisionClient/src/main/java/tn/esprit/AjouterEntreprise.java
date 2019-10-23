package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import tn.esprit.Entity.Entreprise;
import tn.esprit.Service.RevisionServiceRemote;
public class AjouterEntreprise {

	public static void main(String[] args) {
		String jndiName="/Revision-ear/Revision-ejb/RevisionService!tn.esprit.Service.RevisionServiceRemote";
		Context context ;
		try {
			context = (Context) new InitialContext();
			RevisionServiceRemote proxy =(RevisionServiceRemote) context.lookup(jndiName);
			Entreprise e = new Entreprise("AdvyTeam","Dev");
			proxy.ajouterEntreprise(e);
			
			
		} catch (NamingException e) {
			System.out.println(e.getMessage());
		}

	}

}
