package exercice_3;

public class ListeEntier extends Agregat{
	
	private int taille;
	
	public ListeEntier(MaillonEntier debut) {
		super(new MaillonEntier[] {debut});
		taille = 1;
	}

	@Override
	public boolean sup(Object x, Object y) {
		return (Integer) x > (Integer) y;
	}

	@Override
	protected Iterator getIterator() {
		return new IteratorListe(this);
	}

	@Override
	public Object maximum() {
		Iterator it = getIterator();
		it.init();
		
		MaillonEntier max = null;
		
		while(true) {
			
			if (max == null || sup( ((MaillonEntier) (it.courant())).getEtiquette(), max.getEtiquette())) {
				
				max = (MaillonEntier) it.courant();
			}
			
			if (!it.fini())
				it.suivant();
			else 
				break;
		}
		
		return max;
	}
	
	public MaillonEntier tete(){
		return (MaillonEntier) get(0);
	}
	
	public void ajouter(Integer element) {
		IteratorListe it = (IteratorListe) getIterator();
		
		MaillonEntier queue = (MaillonEntier) it.courant();
		
		while (!it.fini()) {
			queue = (MaillonEntier) it.suivant();
		}
		
		MaillonEntier nouveauMaillon = new MaillonEntier(element);
		queue.setSuivant(nouveauMaillon);
		taille ++;
	}
	
	public int taille() {
		return taille;
	}
	
	@Override
	public String toString() {
		
		StringBuilder b = new StringBuilder();
		
		b.append("[");
		
		IteratorListe it = (IteratorListe) getIterator();
		
		while (true) {
			b.append(it.courant().toString() + ", ");
			if (!it.fini())
				it.suivant();
			else
				break;
		}
		
		b.append("]");
		
		return b.toString();
	}
	
	public static void main(String [] args) {
		MaillonEntier tete = new MaillonEntier(1);
		ListeEntier liste = new ListeEntier(tete);
		liste.ajouter(2);
		liste.ajouter(3);
		liste.ajouter(4);
		liste.ajouter(5);
		System.out.println(liste.toString());
		System.out.println(liste.maximum().toString());
	}
}
