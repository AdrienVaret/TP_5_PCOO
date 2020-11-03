package exercice_5;

public class FichierMail extends Fichier{

	public FichierMail(Mail contenu, String nom) {
		super(contenu, nom);
	}

	@Override
	public void execute() {
		((Mail) getContenu()).affiche();
	}

	
}
