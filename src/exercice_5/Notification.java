package exercice_5;

public class Notification extends BoiteMailTableau{

	private BoiteMailTableau boiteMail;
	
	public Notification(BoiteMailTableau boiteMail) {
		super(boiteMail.getExpediteur());
		this.boiteMail = boiteMail;
	}
	
	@Override
	public void recoit(Mail mail) {
		System.out.println("Un nouveau mail est arrivé");
		boiteMail.recoit(mail);
	}

}
