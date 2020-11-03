package exercice_1;

public class Page {
	
	private int nbLignes;
	private String [] lignes;
	
	public Page(String [] lignes) {
		this.lignes = lignes;
		nbLignes = lignes.length;
	}
	
	public int getNbLignes() {
		return nbLignes;
	}
	
	public String getLigne(int index) {
		try {
			return lignes[index];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public void afficherLigne(int index) {
		try {
			System.out.println(lignes[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			//DO_NOTHING
		}
	}
}
