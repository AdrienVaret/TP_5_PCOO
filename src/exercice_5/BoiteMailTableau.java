package exercice_5;

public class BoiteMailTableau extends BoiteMail{

	private static final int TAILLE_BOITE_MAIL = 100;
	
	private Mail mails[] = new Mail[TAILLE_BOITE_MAIL];
	private int courant;
	
	public BoiteMailTableau(String expediteur) {
		super(expediteur);
	}

	@Override
	public Mail getMail(int i) {
		return mails[i];
	}

	@Override
	public void recoit(Mail mail) {
		if (courant == TAILLE_BOITE_MAIL)
			System.out.println("La boite mail est pleine.");
		else { 
			mails[courant] = mail;
			courant ++;
		}
			
	}
}
