package tn.esprit.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Mission implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String name ;
	private String description ;
	@ManyToOne
	private Departement departement ;
	@OneToMany(mappedBy="mission")
	private List<TimeSheet> timesheets;
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mission(int id, String name, String description, Departement departement, List<TimeSheet> timesheets) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.departement = departement;
		this.timesheets = timesheets;
	}
	public List<TimeSheet> getTimesheets() {
		return timesheets;
	}
	public void setTimesheets(List<TimeSheet> timesheets) {
		this.timesheets = timesheets;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Mission(int id, String name, String description, Departement departement) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.departement = departement;
	}
	

}
