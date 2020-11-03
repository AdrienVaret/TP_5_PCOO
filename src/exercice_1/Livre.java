package exercice_1;

public class Livre {
	
	private String titre;
	private int nbPages;
	private Page[] pages;
	
	public Livre(String titre, Page[] pages) {
		this.titre = titre;
		this.pages = pages;
		this.nbPages = pages.length;
	}
	
	public void afficheLigne(int page, int ligne) {
		try {
			String ligneLue = pages[page].getLigne(ligne);
		
			if (ligneLue != null)
				System.out.println(ligneLue);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//DO_NOTHING
		}
	} 
	
	public void affichePage(int page) {
		
		try {
			Page pageLue = pages[page];
			
			for (int i = 0 ; i < pageLue.getNbLignes() ; i++) {
				pageLue.afficherLigne(i);
			}
			
		} catch(ArrayIndexOutOfBoundsException e) {
			//DO_NOTHING
		}
	}
	
	public Page getPages(int i) {
		
		try {
			return pages[i];
			
		} catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getNbPages() {
		return nbPages;
	}

}
