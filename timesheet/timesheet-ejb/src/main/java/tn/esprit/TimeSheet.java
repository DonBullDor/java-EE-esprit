package tn.esprit;

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
	private TimeSheetPK timeSheetpk;

	// @EmbeddedId
	public TimeSheetPK getTimeSheetpk() {
		return timeSheetpk;
	}

	@ManyToOne
	@JoinColumn(name = "idEmploye", referencedColumnName = "id", insertable = false, updatable = false)
	private Employe employe;
	@ManyToOne
	@JoinColumn(name = "idMission", referencedColumnName = "id", insertable = false, updatable = false)
	private Mission mission;
	@Temporal(TemporalType.DATE)
	private Date dateDebt;
	@Temporal(TemporalType.DATE)
	private Date dateFin;

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Date getDateDebt() {
		return dateDebt;
	}

	public void setDateDebt(Date dateDebt) {
		this.dateDebt = dateDebt;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public TimeSheet(Employe employe, Mission mission, Date dateDebt, Date dateFin) {
		super();
		this.employe = employe;
		this.mission = mission;
		this.dateDebt = dateDebt;
		this.dateFin = dateFin;
	}

	public TimeSheet() {
		super();
	}

}