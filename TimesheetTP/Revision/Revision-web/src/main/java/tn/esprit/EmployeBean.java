package tn.esprit;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import tn.esprit.Entity.Employe;
import tn.esprit.Entity.Employee;
import tn.esprit.Entity.Role;
import tn.esprit.Service.EmployeService;

@ManagedBean
public class EmployeBean {

	private String nom;

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String prenom;

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	private String email;

	public void setEmail(String email) {
		this.email = email;
	}

	private String password;

	public void setPassword(String password) {
		this.password = password;
	}

	private boolean isActif;

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	private Role role;

	public void setRole(Role role) {
		this.role = role;
	}

	@EJB
	EmployeService employeService;

	public void setEmployeService(EmployeService employeService) {
		this.employeService = employeService;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public boolean isActif() {
		return isActif;
	}

	public Role getRole() {
		return role;
	}

	public EmployeService getEmployeService() {
		return employeService;
	}

	public void addEmploye() {
		employeService.ajouterEmploye(new Employee(prenom, nom, email, isActif, role, password));
	}

	public String listEmploye() {
		String navigateTo = "/pages/admin/CRUD_Employe?faces-redirect=true";
		return navigateTo;
	}

	public List<Employe> employe;

	public List<Employe> getEmployes() {
		employe = employeService.getAllEmployes();
		return employe;
	}

}
