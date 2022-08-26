package cortei.dto;

public class BarbeiroDTO {

	private String nomeBarbeiro;

	private String senhaBarbeiro;

	public BarbeiroDTO(String nomeBarbeiro, String senhaBarbeiro) {
		super();
		this.nomeBarbeiro = nomeBarbeiro;
		this.senhaBarbeiro = senhaBarbeiro;
	}

	public BarbeiroDTO() {

	}

	public String getNomeBarbeiro() {
		return nomeBarbeiro;
	}

	public void setNomeBarbeiro(String nomeBarbeiro) {
		this.nomeBarbeiro = nomeBarbeiro;
	}

	public String getSenhaBarbeiro() {
		return senhaBarbeiro;
	}

	public void setSenhaBarbeiro(String senhaBarbeiro) {
		this.senhaBarbeiro = senhaBarbeiro;
	}

}
