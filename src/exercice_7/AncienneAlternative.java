package exercice_7;

public class AncienneAlternative extends AncienneQuestion{

	private int [] bonsChoix;
	
	public AncienneAlternative(String question, String [] reponses, int [] bonsChoix) {
		super(question, reponses, -1);
		this.bonsChoix = bonsChoix;
	}
	
	public boolean bienChoisi() {
		
		for (int i = 0 ; i < bonsChoix.length ; i++) {
			if (estCoche(bonsChoix[i]))
				return true;
		}
		
		return false;
	}
}
