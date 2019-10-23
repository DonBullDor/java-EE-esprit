package tn.esprit.Service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.Entity.Departement;
import tn.esprit.Entity.Entreprise;

/**
 * Session Bean implementation class RevisionService
 */
@Stateless
@LocalBean
public class RevisionService implements RevisionServiceRemote {

    
    public RevisionService() {
        
    }
    @PersistenceContext
    EntityManager em ;
	@Override
	public int ajouterEntreprise(Entreprise e) {
		em.persist(e);
		return e.getId();
	}
	public int ajouterDepartement(Departement e) {
		em.persist(e);
		return e.getId();
	}
	public void affecterDepartement(int deptId,int entId) {
		Entreprise entrepriseManagedEntity = em.find(Entreprise.class,entId);
		Departement depManagedEntity= em.find(Departement.class, deptId);
	  depManagedEntity.setEntreprise(entrepriseManagedEntity);
		
	}
    

}
