package tn.esprit.Entity;

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
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prenom;
	private String nom;
	private String email;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private boolean isActif;
	private Role role;

	public Employee(int id, String prenom, String nom, String email, boolean isActif, Role role,
			List<Departement> departements, Contrat contrat, List<TimeSheet> timesheets) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.departements = departements;
		this.contrat = contrat;
		this.timesheets = timesheets;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public List<TimeSheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(List<TimeSheet> timesheets) {
		this.timesheets = timesheets;
	}

	@ManyToMany
	private List<Departement> departements;
	@OneToOne
	private Contrat contrat;
	@OneToMany(mappedBy = "employe")
	private List<TimeSheet> timesheets;

	public Employee(int id, String prenom, String nom, String email, boolean isActif, Role role,
			List<Departement> departements) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.departements = departements;
	}

	public Employee(String prenom, String nom, String email, boolean isActif, Role role, String password) {
		super();

		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.password = password;

	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", isActif=" + isActif
				+ ", role=" + role + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String prenom, String nom, String email, boolean isActif, Role role) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

}
