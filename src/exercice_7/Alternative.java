package exercice_7;

import java.util.ArrayList;

public class Alternative extends Question{

	private ArrayList<Integer> bonsChoix;
	
	public Alternative(String question, String[] reponses, EvaluationQuestion evaluation, ArrayList<Integer> bonsChoix) {
		super(question, reponses, evaluation);
		this.bonsChoix = bonsChoix;
	}

	@Override
	public boolean bienChoisi() {
		
		for (int i = 0 ; i < getReponses().length ; i++) {
			if (estCoche(i)) {
				
				if (!bonsChoix.contains(i))
					return false;
				
				else
					return true;
			}
		}
		
		return false;
	}

}
