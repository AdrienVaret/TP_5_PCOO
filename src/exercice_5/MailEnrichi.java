package exercice_5;

public class MailEnrichi extends Mail{

	private Fichier pieceJointe;
	
	public MailEnrichi(String auteur, String destinataire, String sujet, String contenu) {
		super(auteur, destinataire, sujet, contenu);
	}

	public MailEnrichi(String auteur, String destinataire, String sujet, String contenu, Fichier pieceJointe) {
		super(auteur, destinataire, sujet, contenu);
		this.pieceJointe = pieceJointe;
	}
	
	public void attache(Fichier pieceJointe) {
		this.pieceJointe = pieceJointe;
	}
	
	public Fichier recupere() {
		return pieceJointe;
	}
	
	@Override
	public void affiche() {
		super.affiche();
		if (pieceJointe != null)
			System.out.println("Att: " + pieceJointe.getNom());
	}
	
	/*
	 * NOTE: LSP non respecté car on peut substituer des mails avec PJ par des mails sans PJ
	 */
}
