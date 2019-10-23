package tn.esprit.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class TimeSheet implements Serializable {
	
	@EmbeddedId
	private TimeSheetPK timeSheetPK;
	
	@ManyToOne
	@JoinColumn(name = "idEmploye", referencedColumnName = "id", insertable = false, updatable = false)
	private Employee employe;

	@ManyToOne
	@JoinColumn(name = "idMission", referencedColumnName = "id", insertable = false, updatable = false)
	private Mission mission;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	private Boolean isValide;

	public TimeSheetPK getTimeSheetPK() {
		return timeSheetPK;
	}

	public void setTimeSheetPK(TimeSheetPK timeSheetPK) {
		this.timeSheetPK = timeSheetPK;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Boolean getIsValide() {
		return isValide;
	}

	public void setIsValide(Boolean isValide) {
		this.isValide = isValide;
	}

	public TimeSheet(TimeSheetPK timeSheetPK, Employee employe, Mission mission, Date dateDebut, Date dateFin,
			Boolean isValide) {
		super();
		this.timeSheetPK = timeSheetPK;
		this.employe = employe;
		this.mission = mission;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.isValide = isValide;
	}

	public TimeSheet() {
		super();

	}

}
