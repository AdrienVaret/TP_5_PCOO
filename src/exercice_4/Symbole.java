package exercice_4;

public class Symbole implements ExpRegBase{

	private char symbole;
	
	public Symbole(char symbole) {
		this.symbole = symbole;
	}
	
	@Override
	public String toString() {
		return Character.toString(symbole);
	}
}
