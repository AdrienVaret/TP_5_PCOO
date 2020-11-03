package exercice_3;

public class IteratorListe extends Iterator{

	private ListeEntier liste;
	MaillonEntier courant;
	
	public IteratorListe(ListeEntier liste) {
		this.liste = liste;
		init();
	}
	
	@Override
	void init() {
		courant = (MaillonEntier) liste.get(0);
	}

	@Override
	Object suivant() {
		courant = courant.getSuivant();
		return courant;
	}

	@Override
	boolean fini() {
		return courant.getSuivant() == null;
	}

	@Override
	Object courant() {
		return courant;
	}

}
