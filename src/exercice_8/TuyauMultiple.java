package exercice_8;

public class TuyauMultiple extends Tuyau {
	
	public TuyauMultiple(int n) {
		super(new GestionDestinataires(n));
	}
}
