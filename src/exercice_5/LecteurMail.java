package exercice_5;

public class LecteurMail {

	private BoiteMail boiteMail;
	private StrategieSuivant strategieSuivant;
	//private int courant;
	
	public LecteurMail(BoiteMail boiteMail, StrategieSuivant strategieSuivant) {
		this.boiteMail = boiteMail;
		this.strategieSuivant = strategieSuivant;
	}
	
	public String getExpediteur() {
		return boiteMail.getExpediteur();
	}
	
	public Serveur getServeur() {
		return boiteMail.getServeur();
	}
	
	public void recoit(Mail mail) {
		boiteMail.recoit(mail);
	}
	
	public int getNbMails() {
		return boiteMail.getNbMails();
	}
	
	public void lit(){
		Mail mail = boiteMail.getMailCourant();
		if (mail != null)
			mail.affiche();
	}
	
	public void suivant() { // passe au mail suivant (dans le tableau) 
		strategieSuivant.suivant(this);
	}
	
	public void ecrit(String destinataire, String sujet, String contenu) {
		getServeur().envoie(new Mail(getExpediteur(), destinataire, sujet, contenu));
	}
	
	public void ecrit(String destinataire, String sujet, String contenu, Fichier pieceJointe) {
		getServeur().envoie(new MailEnrichi(getExpediteur(), destinataire, sujet, contenu, pieceJointe));
	}
	
	public void repond(String reponse) { // repond au mail courant
		ecrit(boiteMail.getMailCourant().getAuteur(), "Re:" + boiteMail.getMailCourant().getSujet(), boiteMail.getMailCourant().getContenu() + reponse);
	}
	
	public void transfere(String destinataire) { // transfere le mail courant
		ecrit(destinataire, "Tr:" + boiteMail.getMailCourant().getSujet(), boiteMail.getMailCourant().getContenu());
	}
	
}
