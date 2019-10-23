package tn.esprit;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TimeSheetPK  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int idEmploye; 
	private int idMission;

}
