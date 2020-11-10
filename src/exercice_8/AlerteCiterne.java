package exercice_8;

public class AlerteCiterne extends Citerne{

	private Citerne citerne;
	private int seuil;
	
	public AlerteCiterne(Citerne citerne, String nom, int seuil) {
		super(nom);
		this.seuil = seuil;
		this.citerne = citerne;
	}

	@Override
	public void recoit(int n) {
		citerne.recoit(n);
		if (citerne.getQuantite() > seuil)
			System.out.println("Seuil dépassé");
	}
}
