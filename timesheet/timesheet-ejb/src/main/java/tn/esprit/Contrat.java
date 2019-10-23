package tn.esprit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private String typeContre;
	private float salaire;
	
	@OneToOne(mappedBy="contrat")
	private Employe employe;
	
	
	public Contrat(Date dateDebut, String typeContre, float salaire) {
		super();
		this.dateDebut = dateDebut;
		this.typeContre = typeContre;
		this.salaire = salaire;
	}
	
	
	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}


	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContre() {
		return typeContre;
	}
	public void setTypeContre(String typeContre) {
		this.typeContre = typeContre;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public Contrat(int reference, Date dateDebut, String typeContre, float salaire) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.typeContre = typeContre;
		this.salaire = salaire;
	}
	public Contrat() {
		super();
	}
	
	
	
}
