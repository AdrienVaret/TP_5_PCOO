package exercice_8;

public abstract class CiterneLimitee extends Citerne{

	private int quantiteMax;
	
	public CiterneLimitee(String nom, int quantiteMax) {
		super(nom);
		this.quantiteMax = quantiteMax;
	}
	
	public int getQuantiteMax() {
		return quantiteMax;
	}
	
	public abstract void gereSurplus();

}
