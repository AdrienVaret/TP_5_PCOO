package exercice_5;

public class LecteurMail3 extends LecteurMail{

	private StrategieSuivant strategieSuivant;
	
	public LecteurMail3(String expediteur, StrategieSuivant strategieSuivant) {
		super(expediteur);
		this.strategieSuivant = strategieSuivant;
	}

	@Override
	public void suivant() {
		strategieSuivant.suivant(this);
	}
	
	public void setStrategieSuivant(StrategieSuivant strategieSuivant) {
		this.strategieSuivant = strategieSuivant;
	}
	
}
