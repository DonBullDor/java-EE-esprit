package tn.esprit.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TimeSheetPK implements Serializable {
	private int idEmploye;
	private int idMission;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmploye;
		result = prime * result + idMission;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeSheetPK other = (TimeSheetPK) obj;
		if (idEmploye != other.idEmploye)
			return false;
		if (idMission != other.idMission)
			return false;
		return true;
	}
	
	

}
