package exercice_4;

public class ChaineFactory {

	public static ExpReg creeChaine(String chaine) {
		
		if (chaine.equals(""))
			return new Epsilon();
		
		else if (chaine.length() == 1)
			return new Symbole(chaine.charAt(0));
		
		else 
			return new Concat(new Symbole(chaine.charAt(0)), creeChaine(chaine.substring(1)));
	}
}
