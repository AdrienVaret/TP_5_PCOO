package exercice_1;

public class AdapteurLivreDefilant implements TexteDefilant{

	private Livre livre;
	
	private int indexLigne = 0;
	private int indexPage = 0;
	private Page page;
	
	private boolean fin = false;
	
	public AdapteurLivreDefilant(Livre livre) {
		this.livre = livre;
		page = livre.getPage(0);
	}
	
	@Override
	public void ligneSuivante() {
		if (!fin) {
			
			if (indexLigne < page.getNbLignes()) {
				page.afficherLigne(indexLigne);
				indexLigne ++;
			}
			
			else {
				//Nouvelle page
				indexLigne = 0;
				indexPage ++;
				page = livre.getPage(indexPage);
				if (page == null) {
					System.out.println("Vous êtes à la fin du livre.");
					fin = true;
				}
				
				else {
					page.afficherLigne(indexLigne);
					indexLigne ++;
				}
			}
		}
	}
	
	@Override
	public void ecranSuivant() {
		for (int i = 0 ; i < 50 ; i++) {
			ligneSuivante();
		}
	}
}
