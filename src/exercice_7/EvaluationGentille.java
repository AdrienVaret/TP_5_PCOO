package exercice_7;

public class EvaluationGentille implements EvaluationQuestion{

	@Override
	public int evalue(Question question) {
		if (question.bienChoisi())
			return 1;
		return 0;
	}

	
}
