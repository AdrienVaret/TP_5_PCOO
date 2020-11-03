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
		ecrit(boiteMail.getMail(courant).getAuteur(), "Re:" + boiteMail.getMail(courant).getSujet(), boiteMail.getMail(courant).getContenu() + reponse);
	}
	
	public void transfere(String destinataire) { // transfere le mail courant
		ecrit(destinataire, "Tr:" + boiteMail.getMail(courant).getSujet(), boiteMail.getMail(courant).getContenu());
	}
	
	/*
	private Mail lesMails[] = new Mail[100];
	private int nbMails;
	private int courant; // indice d’un mail dans le tableau lesMails 
	private String expediteur;
	
	private Serveur serveur = new Serveur(); // serveur de mails
	
	public LecteurMail(String expediteur) {
		this.expediteur = expediteur;
	}
	     
	public Mail getMailCourant() { 
		return lesMails[courant]; 
	} 
	
	public String getExpediteur() { 
		return expediteur; 
	}
	
	public Serveur getServeur() { 
		return serveur; 
	}
	
	public void recoit(Mail m) {
		lesMails[nbMails] = m;
		nbMails++;
	}
	
	public int getNbMails() {
		return nbMails;
	}
	
	public void lit(){
		lesMails[courant].affiche();
	}
	
	public void setCourant(int courant) {
		this.courant = courant;
	}
	
	public int getCourant() {
		return courant;
	}
	
	public void suivant() { // passe au mail suivant (dans le tableau) 
		if(nbMails == 0)
			System.out.println("Pas de mails");
	    else {
	    	courant ++;
	        if(courant == nbMails)
	        	courant = 0;
	    } 
	}
	
	public void ecrit(String destinataire, String sujet, String contenu) {
		serveur.envoie(new Mail(expediteur, destinataire, sujet, contenu));
	}
	
	public void repond(String reponse) { // repond au mail courant
		ecrit(lesMails[courant].getAuteur(), "Re:" + lesMails[courant].getSujet(), lesMails[courant].getContenu() + reponse);
	}
	
	public void transfere(String destinataire) { // transfere le mail courant
		ecrit(destinataire, "Tr:" + lesMails[courant].getSujet(), lesMails[courant].getContenu());
	} */
}
