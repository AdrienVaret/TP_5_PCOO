package exercice_1;

public class DecorateurEntete extends Livre{

	public DecorateurEntete(String titre, Page[] pages) {
		super(titre, pages);
	}

	@Override
	public void affichePage(int page) {
		System.out.println(getTitre());
		super.affichePage(page);
	}
}
