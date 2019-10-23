package tn.esprit.Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import tn.esprit.Entity.Employe;
import tn.esprit.Entity.Employee;

/**
 * Session Bean implementation class EmployeService
 */
@Stateless
@LocalBean
public class EmployeService implements EmployeServiceRemote {
	@PersistenceContext
	EntityManager em;

	@Override
	public int ajouterEmploye(Employee e) {
		em.persist(e);
		return e.getId();
	}

	@PersistenceContext(unitName = "Revision_JEE")
	EntityManager emm;

	@Override
	public Employe getEmployeByEmailAndPassword(String email, String password) {
		TypedQuery<Employe> query = emm
				.createQuery("Select e From Employe e WHERE e.email=:email AND e.password=:password", Employe.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		Employe employe = null;
		try {
			employe = query.getSingleResult();

		} catch (Exception e) {
			System.out.println("ERROR :" + e);
		}

		return employe;
	}

	public List<Employe> getAllEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

}
