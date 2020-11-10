package exercice_8;

public class GestionDestinataires implements GestionDestinataire{

	private Destination[] destinataires;
	
	public GestionDestinataires(int n) {
		destinataires = new Destination[n];
	}
	
	@Override
	public void ajoute(Destination d) {
		boolean add = false;
		for (int i = 0 ; i < destinataires.length ; i++) {
			if (destinataires[i] != null) {
				destinataires[i] = d;
				add = true;
			}
		}
		
		if (!add)
			System.out.println("Pas de place pour ajouter un nouveau destinataire");
	}

	@Override
	public void retire(Destination d) {
		for (int i = 0 ; i < destinataires.length ; i++) {
			if (destinataires[i] == d) 
				destinataires[i] = null;
		}
	}

	@Override
	public void fournit(int n) {
		for (int i = 0 ; i < destinataires.length ; i++) {
			if (destinataires[i] != null) {
				destinataires[i].recoit(n / destinataires.length);
			}
		}
	}

}
