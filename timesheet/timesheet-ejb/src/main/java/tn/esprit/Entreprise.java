package tn.esprit;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", name=" + name + ", raisonSocialee=" + raisonSocialee + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String raisonSocialee;

	@OneToMany(mappedBy = "entreprise", cascade = CascadeType.REMOVE)
	private List<Departement> departements;

	public Entreprise(String name, String raisonSocialee) {
		super();
		this.name = name;
		this.raisonSocialee = raisonSocialee;

	}

	public Entreprise(int id, String name, String raisonSocialee, List<Departement> departements) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocialee = raisonSocialee;
		this.departements = departements;
	}

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaisonSocialee() {
		return raisonSocialee;
	}

	public void setRaisonSocialee(String raisonSocialee) {
		this.raisonSocialee = raisonSocialee;
	}

	public Entreprise(int id, String name, String raisonSocialee) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocialee = raisonSocialee;
	}

	public Entreprise() {
		super();
	}

}
