package exercice_3;

public class IteratorTableau extends Iterator{

	private TableauEntier tableau;
	private int index;
	
	public IteratorTableau(TableauEntier tableau) {
		this.tableau = tableau;
		init();
	}
	
	@Override
	void init() {
		index = 0;
	}

	@Override
	Object suivant() {
		index ++;
		return tableau.get(index);
	}

	@Override
	boolean fini() {
		return index >= tableau.taille();
	}

	@Override
	Object courant() {
		return tableau.get(index);
	}

}
