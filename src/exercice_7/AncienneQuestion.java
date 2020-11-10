package exercice_7;

public class AncienneQuestion {

	private String question;
	private String [] reponses;
	private boolean [] coches;
	private int bonChoix;
	
	public AncienneQuestion(String question, String [] reponses, int bonChoix) {
		this.question = question;
		this.reponses = reponses;
		this.bonChoix = bonChoix;
	}
	
	void coche(int i) {
		coches[i] = true;
	}
	
	public boolean estCoche(int i) {
		return coches[i];
	}
	
	public boolean bienChoisi() {
		for (int i = 0 ; i < coches.length ; i++) {
			if (!coches[i] && bonChoix == i || coches[i] && bonChoix != 1)
				return false;
		}
		return true;
	}
	
	public boolean nonTraitee() {
		for (int i = 0 ; i < coches.length ; i++) {
			if (coches[i])
				return false;
		}
		return true;
	}
	
	public String[] getReponses() {
		return reponses;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public int getBonChoix() {
		return bonChoix;
	}
	
	public int evalue() {
		if (nonTraitee())
			return 0;
		else if (bienChoisi())
			return 1;
		else 
			return -1;
	}
}
