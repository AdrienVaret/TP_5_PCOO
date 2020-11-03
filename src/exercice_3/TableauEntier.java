package exercice_3;

public class TableauEntier extends Agregat{

	public TableauEntier(Integer[] t) {
		super(t);
	}

	@Override
	public boolean sup(Object x, Object y) {
		return (Integer) x > (Integer) y;
	}

	public static void main(String [] args) {
		
		TableauEntier t = new TableauEntier(new Integer [] {1, 2, 3, 4, 5});
		System.out.println(t.maximum());
	}

	@Override
	protected Iterator getIterator() {
		return new IteratorTableau(this);
	}
}
