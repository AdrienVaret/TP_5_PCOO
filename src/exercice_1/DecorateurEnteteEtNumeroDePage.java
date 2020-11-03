package exercice_1;

public class DecorateurEnteteEtNumeroDePage extends Livre{

	public DecorateurEnteteEtNumeroDePage(String titre, Page[] pages) {
		super(titre, pages);
	}
	
	@Override
	public void affichePage(int page) {
		System.out.println(getTitre());
		super.affichePage(page);
		System.out.println("(" + (page + 1) + ")");
	}
	
}
