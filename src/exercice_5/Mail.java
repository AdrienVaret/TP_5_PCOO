package exercice_5;

public class Mail {

	private String auteur;
    private String destinataire;
    private String sujet;
    private String contenu;
    private boolean lu;
    
    public Mail(String auteur, String destinataire, String sujet, String contenu) {
        this.auteur = auteur;
        this.destinataire = destinataire;
        this.sujet = sujet;
        this.contenu = contenu;
    }
    
    public String getAuteur() { 
    	return auteur; 
    }
    
    public void setAuteur(String auteur) { 
    	this.auteur = auteur; 
    }
    
    public void setLu() { 
    	lu = true; 
    }
    
    public boolean getLu() { 
    	return lu; 
    }
    
    public String getSujet() { 
    	return sujet; 
    }
    
    public String getContenu() { 
    	return contenu; 
    }
    
    public void affiche() {
        System.out.println("From: " + auteur + "\nTo: " + destinataire +
                                    "\nSujet:" + sujet + "\n" + contenu);
        lu = true; 
    }
}
