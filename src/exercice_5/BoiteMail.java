package exercice_5;

public abstract class BoiteMail {

	private int nbMails;
	private String expediteur;
	private Serveur serveur = new Serveur();
	
	public BoiteMail(String expediteur) {
		this.expediteur = expediteur;
	}
	
	public abstract Mail getMail(int i);
	
	public abstract Mail getMailCourant();
	
	public String getExpediteur() {
		return expediteur;
	}
	
	public Serveur getServeur() {
		return serveur;
	}
	
	public int getNbMails() {
		return nbMails;
	}
	
	public void setNbMails(int nbMails) {
		this.nbMails = nbMails;
	}
	
	public abstract void recoit(Mail mail);
	
	public void ecrit(String destinataire, String sujet, String contenu) {
		serveur.envoie(new Mail(expediteur, destinataire, sujet, contenu));
	}
}
