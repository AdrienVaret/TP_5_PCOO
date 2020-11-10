package exercice_7;

public class QuestionSimple extends Question{

	private int bonChoix;
	
	public QuestionSimple(String question, String [] reponses, int bonChoix, EvaluationQuestion evaluation) {
		super(question, reponses, evaluation);
		this.bonChoix = bonChoix;
	}
	
	
	public boolean bienChoisi() {
		
		for (int i = 0 ; i < getReponses().length ; i++) {
			if (!estCoche(i) && bonChoix == i || estCoche(i) && bonChoix != i)
				return false;
		}
		return true;
	}
	
}
