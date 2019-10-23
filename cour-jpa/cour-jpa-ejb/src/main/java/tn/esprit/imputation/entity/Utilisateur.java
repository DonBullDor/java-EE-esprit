package tn.esprit.imputation.entity;

import java.io.Serializable;
import javax.persistence.*;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_UTILISATEUR")
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="UT_ID")
	int id;
	@Column(name="UT_NOM")
	String nom;
	@Column(name="UT_PRENOM")
	String prenom;
	@Column(name="UT_ADRESS_MAIL")
	String email;

	public Utilisateur() {}

	public Utilisateur(int id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

