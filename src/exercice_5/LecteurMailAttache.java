package exercice_5;

public class LecteurMailAttache extends LecteurMail{

	public LecteurMailAttache(String expediteur) {
		super(expediteur);
	}
	
	public void traiteAttachement() {
		Mail mail = getMailCourant();
		
		if (mail instanceof MailEnrichi) {
			((MailEnrichi) mail).recupere().execute();
		}
	}
	
	public void transfereEnAttache(String destinataire) {
		Mail mail = getMailCourant();
		
		getServeur().envoie(new MailEnrichi(getExpediteur(), destinataire, "TR: " + mail.getSujet(), "", 
				                            new FichierMail(mail, "mail_" + mail.getAuteur())));
	}
}
