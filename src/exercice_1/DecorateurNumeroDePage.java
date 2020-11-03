package exercice_1;

public class DecorateurNumeroDePage extends Livre{

	public DecorateurNumeroDePage(String titre, Page[] pages) {
		super(titre, pages);
	}
	
	@Override
	public void affichePage(int page) {
		super.affichePage(page);
		System.out.println("(" + (page + 1) + ")");
	}

}
