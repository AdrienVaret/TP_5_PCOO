package exercice_8;

public class Citerne implements Source{

	private int quantite;
	private String nom;
	
	public Citerne(String nom) {
		this.nom = nom;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public void recoit(int n) {
		quantite += n;
		System.out.println(nom + " : " + quantite);
	}
	
	public void vide(int n) {
		quantite -= n;
	}

	@Override
	public void fournit(int n) {
		// TODO Auto-generated method stub
	}

	@Override
	public void ajouteDestinataire(Destination d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retireDestinataire(Destination d) {
		// TODO Auto-generated method stub
		
	}

	public String getNom() {
		return nom;
	}
}
