package tn.esprit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "externe")
public class MissionExterne extends Mission {

	private String emailFacturation;
	private float tauxjournlaierMoyen;

	public MissionExterne(String emailFacturation, float tauxjournlaierMoyen) {
		super();
		this.emailFacturation = emailFacturation;
		this.tauxjournlaierMoyen = tauxjournlaierMoyen;
	}

	public MissionExterne() {
		super();
	}

	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public float getTauxjournlaierMoyen() {
		return tauxjournlaierMoyen;
	}

	public void setTauxjournlaierMoyen(float tauxjournlaierMoyen) {
		this.tauxjournlaierMoyen = tauxjournlaierMoyen;
	}

}
