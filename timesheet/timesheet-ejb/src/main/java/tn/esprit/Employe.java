package tn.esprit;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employe implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ; 
	private String nom ; 
	private String prenom;
	private String emmail;
	private boolean isActif ; 
	private Role role;
	@OneToOne
	private Contrat contrat;
	public Employe(String nom, String prenom, String emmail, boolean isActif, Role role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.emmail = emmail;
		this.isActif = isActif;
		this.role = role;
	}
	@ManyToMany
	private List<Departement> departements;
	
	@OneToMany(mappedBy="employe")
	private List<TimeSheet> timeSheets;
	
	
	public List<TimeSheet> getTimeSheets() {
		return timeSheets;
	}

	public void setTimeSheets(List<TimeSheet> timeSheets) {
		this.timeSheets = timeSheets;
	}

	public Employe() {
		super();
	}
	
	public Employe(int id, String nom, String prenom, String emmail, boolean isActif, Role role, Contrat contrat,
			List<Departement> departements) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.emmail = emmail;
		this.isActif = isActif;
		this.role = role;
		this.contrat = contrat;
		this.departements = departements;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmmail() {
		return emmail;
	}
	public void setEmmail(String emmail) {
		this.emmail = emmail;
	}
	public boolean isActif() {
		return isActif;
	}
	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public List<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	
}
