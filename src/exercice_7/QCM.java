package exercice_7;

public class QCM {

	private AncienneQuestion [] questions;
	
	public QCM(AncienneQuestion[] questions) {
		this.questions = questions;
	}
	
	public void coche(int question, int choix) {
		questions[question].coche(choix);
	}
	
	public int note() {
		int note = 0;
		for (int i = 0 ; i < questions.length ; i++) {
			note += questions[i].evalue();
		}
		return note;
	}
}
