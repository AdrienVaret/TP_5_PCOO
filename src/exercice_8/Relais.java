package exercice_8;

public abstract class Relais extends Destination implements Source{

	private GestionDestinataire gestionDestinataire;
	
	public Relais(GestionDestinataire gestionDestinataire) {
		this.gestionDestinataire = gestionDestinataire;
	}
	
	@Override
	public void fournit(int n) {
		gestionDestinataire.fournit(n);
	}

	@Override
	public void ajouteDestinataire(Destination d) {
		gestionDestinataire.ajoute(d);
	}

	@Override
	public void retireDestinataire(Destination d) {
		gestionDestinataire.retire(d);
	}

	@Override
	public void recoit(int n) {
		fournit(n);
	}

}
