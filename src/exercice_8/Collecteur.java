package exercice_8;

public class Collecteur implements Source{

	private Destination destinataire;
	
	@Override
	public void fournit(int n) {
		destinataire.recoit(n);
	}

	@Override
	public void ajouteDestinataire(Destination d) {
		destinataire = d;
	}

	@Override
	public void retireDestinataire(Destination d) {
		destinataire = null;
	}

}
