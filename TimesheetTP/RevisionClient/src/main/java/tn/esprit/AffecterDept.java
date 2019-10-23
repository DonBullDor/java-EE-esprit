package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.Entity.Departement;
import tn.esprit.Entity.Entreprise;
import tn.esprit.Service.RevisionServiceRemote;

public class AffecterDept {

	public static void main(String[] args) {
		String jndiName = "/Revision-ear/Revision-ejb/RevisionService!tn.esprit.Service.RevisionServiceRemote";
		Context context;
		try {
			context = (Context) new InitialContext();
			RevisionServiceRemote proxy = (RevisionServiceRemote) context.lookup(jndiName);
//			Entreprise ee = new Entreprise("AdvyTeam2","Dev2");
//			Departement e = new Departement("Devlp2");
//			proxy.ajouterDepartement(e);
//			proxy.ajouterEntreprise(ee);

			proxy.affecterDepartement(1, 1);

		} catch (NamingException e) {
			System.out.println(e.getMessage());
		}

	}

}
