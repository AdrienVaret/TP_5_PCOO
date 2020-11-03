package exercice_3;

public abstract class Agregat {

	private Object[] t;
	
	public Agregat(Object[] t) {
		this.t = t;
	}
	
	public abstract boolean sup(Object x, Object y);
	protected abstract Iterator getIterator();
	
	public Object maximum() {
		
		Iterator it = getIterator();
		it.init();
		
		Object max = null;
		
		while(!it.fini()) {
			
			if (max == null || sup(it.courant(), max)) {
				max = it.courant();
			}
			
			it.suivant(); 
		}
		
		return max;
	}
	
	public int taille() {
		return t.length;
	}
	
	public Object get(int index) {
		return t[index];
	}
}
