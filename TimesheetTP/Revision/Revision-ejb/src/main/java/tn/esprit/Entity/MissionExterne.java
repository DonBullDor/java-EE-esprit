package tn.esprit.Entity;

import java.util.List;

import javax.enterprise.context.Destroyed;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class MissionExterne extends Mission {

	private String emailFacturation;
	private float tauxJournalierMoyen;

	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MissionExterne(int id, String name, String description, Departement departement,
			List<TimeSheet> timesheets) {
		super(id, name, description, departement, timesheets);
		// TODO Auto-generated constructor stub
	}

	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public float getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}

	public void setTauxJournalierMoyen(float tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	public MissionExterne(int id, String name, String description, Departement departement, String emailFacturation,
			float tauxJournalierMoyen) {
		super(id, name, description, departement);
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	public MissionExterne(int id, String name, String description, Departement departement) {
		super(id, name, description, departement);
		// TODO Auto-generated constructor stub
	}

}
