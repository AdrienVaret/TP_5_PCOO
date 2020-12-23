package exercice_1;

public class DecorateurNumeroDePage extends Livre{

	private Livre livre;

	public DecorateurNumeroDePage(Livre livre) {
        super(livre.getTitre(), livre.getPages());
		this.livre = livre;
	}
	
	@Override
	public void affichePage(int page) {
		livre.affichePage(page);
		System.out.println("(" + (page + 1) + ")");
	}

}
