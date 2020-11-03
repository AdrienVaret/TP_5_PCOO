package exercice_5;

public class VieuxLecteurMail {

	private Mail lesMails[] = new Mail[100];
	private int nbMails;
	private int courant; // indice d’un mail dans le tableau lesMails 
	private String expediteur;
	
	private Serveur serveur = new Serveur(); // serveur de mails
	
	public VieuxLecteurMail(String expediteur) {
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
	} 
	
}
