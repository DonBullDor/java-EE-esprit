package tn.esprit.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String name ;
	@ManyToOne
	private Entreprise entreprise;
	
	@OneToMany(mappedBy="departement")
	private List<Mission> mission ;
	@ManyToMany(mappedBy="departements")
	private List <Employee> employe ;
	public Departement(int id, String name, Entreprise entreprise, List<Mission> mission, List<Employee> employe) {
		super();
		this.id = id;
		this.name = name;
		this.entreprise = entreprise;
		this.mission = mission;
		this.employe = employe;
	}
	public List<Employee> getEmploye() {
		return employe;
	}
	public void setEmploye(List<Employee> employe) {
		this.employe = employe;
	}
	public Departement(int id, String name, Entreprise entreprise, List<Mission> mission) {
		super();
		this.id = id;
		this.name = name;
		this.entreprise = entreprise;
		this.mission = mission;
	}
	public List<Mission> getMission() {
		return mission;
	}
	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}
	public Departement(int id, String name, Entreprise entreprise) {
		super();
		this.id = id;
		this.name = name;
		this.entreprise = entreprise;
	}
	public Departement(String name) {
		super();		
		this.name = name;
	}
	public Departement(String name, Entreprise entreprise) {
		super();		
		this.name = name;
		this.entreprise = entreprise;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
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
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
