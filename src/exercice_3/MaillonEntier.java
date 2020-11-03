package exercice_3;

public class MaillonEntier {

	private Integer etiquette;
	private MaillonEntier suivant;
	
	public MaillonEntier(Integer etiquette){
		this.etiquette = etiquette;
	}
	
	public Integer getEtiquette() {
		return etiquette;
	}
	
	public MaillonEntier getSuivant() {
		return suivant;
	}
	
	public void setSuivant(MaillonEntier suivant) {
		this.suivant = suivant;
	}
	
	@Override
	public String toString() {
		return etiquette.toString();
	}
}
