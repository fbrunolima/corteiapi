package cortei.entity;

public class BarbeiroEntity {

	private String nomeBarbeiro;

	private String senhaBarbeiro;

	public BarbeiroEntity(String nomeBarbeiro, String senhaBarbeiro) {
		super();
		this.nomeBarbeiro = nomeBarbeiro;
		this.senhaBarbeiro = senhaBarbeiro;
	}

	public BarbeiroEntity() {

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
