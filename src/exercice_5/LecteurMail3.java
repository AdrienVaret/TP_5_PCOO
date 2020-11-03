package exercice_5;

public class LecteurMail3 extends VieuxLecteurMail{

	@SuppressWarnings("unused")
	private StrategieSuivant strategieSuivant;
	
	public LecteurMail3(String expediteur, StrategieSuivant strategieSuivant) {
		super(expediteur);
		this.strategieSuivant = strategieSuivant;
	}

	@Override
	public void suivant() {
		//Commenté mais OK
		//strategieSuivant.suivant(this);
	}
	
	public void setStrategieSuivant(StrategieSuivant strategieSuivant) {
		this.strategieSuivant = strategieSuivant;
	}
	
}
