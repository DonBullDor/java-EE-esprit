package tn.esprit.Service;

import javax.ejb.Local;
import javax.ejb.Remote;

import tn.esprit.Entity.Employe;

@Local
public interface EmployeServiceRemote {
	public int ajouterEmploye(tn.esprit.Entity.Employee e);

	Employe getEmployeByEmailAndPassword(String email, String password);

}
