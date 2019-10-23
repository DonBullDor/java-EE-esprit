package tn.esprit.Service;

import javax.ejb.Remote;

@Remote
public interface RevisionServiceRemote {
	public int ajouterEntreprise(tn.esprit.Entity.Entreprise e);
	public int ajouterDepartement(tn.esprit.Entity.Departement e);
	public void affecterDepartement(int e , int ee);

}
