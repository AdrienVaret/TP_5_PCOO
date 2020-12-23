package exercice_1;

public class Exercice1Test {
	
	public static void main(String [] args) {
		Page [] pages = new Page [] { new Page(new String [] {"Salut", "comment", "vas-tu", "?"}), new Page(new String [] {"Salut", "bien", "et", "toi", "?"})};
	
		Livre livre = new Livre("Titre", pages);
		Livre livreE = new DecorateurEntete(livre); // heritage dynamique
		Livre livreN = new DecorateurNumeroDePage(livre); // heritage dynamique
		Livre livreEN = new DecorateurEntete(new DecorateurNumeroDePage(livre)); // heritage multiple sans creer une troisieme classe
		livreEN.affichePage(0);
	}
}
