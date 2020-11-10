package exercice_7;

public abstract class Question {

	private String question;
	private String [] reponses;
	private boolean [] coches;
	private EvaluationQuestion evaluation;
	
	public Question(String question, String [] reponses, EvaluationQuestion evaluation) {
		this.question = question;
		this.reponses = reponses;
		this.evaluation = evaluation;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String[] getReponses() {
		return reponses;
	}
	
	public void coche(int i) {
		coches[i] = true;
	}
	
	public boolean estCoche(int i) {
		return coches[i];
	}
	
	public int evalue() {
		return evaluation.evalue(this);
	}
	
	public boolean nonTraitee() {
		for (int i = 0 ; i < coches.length ; i++) {
			if (coches[i])
				return false;
		}
		return true;
	}
	
	public abstract boolean bienChoisi();
}
