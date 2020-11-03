package exercice_5;

public abstract class Fichier {
	
	private Object contenu;
	private String nom;
	
	public Fichier(Object contenu, String nom) {
		this.contenu = contenu;
	    this.nom = nom;
	}
	
	public Object getContenu() { 
		return contenu; 
	}
	
	public String getNom() { 
		return nom; 
	}
	
	public abstract void execute();
}
