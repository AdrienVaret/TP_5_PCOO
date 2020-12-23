package exercice_1;

public class DecorateurEntete extends Livre{

	private Livre livre;
    
	public DecorateurEntete(Livre livre) {
        super(livre.getTitre(), livre.getPages());
		this.livre = livre;
	}
	@Override
	public void affichePage(int page) {
		System.out.println(getTitre());
		livre.affichePage(page);
	}
}
