package exercice_3;

public abstract class Tableau {

	private Object[] t;
	
	public Tableau(Object[] t) {
		this.t = t;
	}

	public Object maximum() {
		Object max = null;
		
		for (Object o : t) {
			
			if (max == null || sup (o, max))
				max = o;
		}
		
		return max;
	}
	
	public abstract boolean sup(Object x, Object y);
}
