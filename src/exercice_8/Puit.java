package exercice_8;

public class Puit extends Destination{

	private Citerne citerne;
	
	public Puit(Citerne citerne) {
		this.citerne = citerne;
	}
	
	@Override
	public void recoit(int n) {
		citerne.recoit(n);
	}

}
