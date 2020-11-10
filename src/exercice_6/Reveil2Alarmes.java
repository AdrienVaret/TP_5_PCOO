package exercice_6;

public class Reveil2Alarmes implements Observateur{

	private Reveil reveil1;
	private Reveil reveil2;
	
	public Reveil2Alarmes(Reveil reveil1, Reveil reveil2) {
		this.reveil1 = reveil1;
		this.reveil2 = reveil2;
	}
	
	@Override
	public void miseAJour(HorlogeReveil h) {
		reveil1.miseAJour(h);
		reveil2.miseAJour(h);
	}	
}
