package exercice_8;

public class GestionUnDestinataire implements GestionDestinataire{

	private Destination destinataire;
	
	@Override
	public void ajoute(Destination d) {
		destinataire = d;
	}

	@Override
	public void retire(Destination d) {
		destinataire = null;
	}

	@Override
	public void fournit(int n) {
		destinataire.recoit(n);
	}

}
