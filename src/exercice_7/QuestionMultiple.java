package exercice_7;

import java.util.ArrayList;

public class QuestionMultiple extends Question{

	private ArrayList<Integer> bonsChoix;
	
	public QuestionMultiple(String question, String[] reponses, EvaluationQuestion evaluation, ArrayList<Integer> bonsChoix) {
		super(question, reponses, evaluation);
		this.bonsChoix = bonsChoix;
	}

	@Override
	public boolean bienChoisi() {
		int nbReponses = 0;
		
		for (int i = 0 ; i < getReponses().length ; i++) {
			if (bonsChoix.contains(i)) {
				
				if (!estCoche(i))
					return false;
				else
					nbReponses ++;
			}
			
			else {
				
				if (estCoche(i))
					return false;
			}
		}
		
		return (nbReponses == bonsChoix.size());
	}

}
