package tn.esprit.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contrat implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int referance ;
	private Date dateDebut ;
	private String typeContrat ;
	private float salaire ;
	@OneToOne(mappedBy="contrat")
	private Employee employe ;
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getReferance() {
		return referance;
	}
	public void setReferance(int referance) {
		this.referance = referance;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public Employee getEmploye() {
		return employe;
	}
	@Override
	public String toString() {
		return "Contrat [referance=" + referance + ", dateDebut=" + dateDebut + ", typeContrat=" + typeContrat
				+ ", salaire=" + salaire + ", employe=" + employe + "]";
	}
	public void setEmploye(Employee employe) {
		this.employe = employe;
	}
	public Contrat(int referance, Date dateDebut, String typeContrat, float salaire, Employee employe) {
		super();
		this.referance = referance;
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
		this.employe = employe;
	}
}