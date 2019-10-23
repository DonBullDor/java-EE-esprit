package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "T_FORMATION_DETAIL")
public class FormationDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FD_ID")
	private Long fdId;

	@Column(name = "FD_TABLE_MATIERE")
	private String fdTableMatiere;

	@Column(name = "FD_SUPPORT_PDF")
	private String fdSupportPDF;

	public FormationDetail(Long fdId, String fdTableMatiere, String fdSupportPDF) {
		super();
		this.fdId = fdId;
		this.fdTableMatiere = fdTableMatiere;
		this.fdSupportPDF = fdSupportPDF;
	}

	public FormationDetail() {
		super();
	}

	public Long getFdId() {
		return fdId;
	}

	public void setFdId(Long fdId) {
		this.fdId = fdId;
	}

	public String getFdTableMatiere() {
		return fdTableMatiere;
	}

	public void setFdTableMatiere(String fdTableMatiere) {
		this.fdTableMatiere = fdTableMatiere;
	}

	public String getFdSupportPDF() {
		return fdSupportPDF;
	}

	public void setFdSupportPDF(String fdSupportPDF) {
		this.fdSupportPDF = fdSupportPDF;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}