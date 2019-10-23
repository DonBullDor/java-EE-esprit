package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Formation
 *
 */
@Entity
@Table(name = "T_FORMATION")
public class Formation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="FORMATION_ID") 
	private Long id; // Identifiant formation (Clé primaire)
	  
	@Column(name="FORMATION_THEME")
	private String theme; // Thème formation 
	  
	@OneToOne
	@JoinColumn(name="FK_FD_ID") 
	private FormationDetail formationDetail; 

	public Formation(Long id, String theme, FormationDetail formationDetail) {
		super();
		this.id = id;
		this.theme = theme;
		this.formationDetail = formationDetail;
	}

	public Formation() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getTheme() {
		return theme;
	}

	public FormationDetail getFormationDetail() {
		return formationDetail;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public void setFormationDetail(FormationDetail formationDetail) {
		this.formationDetail = formationDetail;
	}

	
	
}
