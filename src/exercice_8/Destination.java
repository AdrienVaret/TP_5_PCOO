package exercice_8;

public abstract class Destination {

	private Source source;
	
	public void raccorde(Source s) {
		source = s;
		s.ajouteDestinataire(this);
	}
	
	public void retire() {
		source.retireDestinataire(this);
		source = null;
	}
	
	public abstract void recoit(int n);
}
