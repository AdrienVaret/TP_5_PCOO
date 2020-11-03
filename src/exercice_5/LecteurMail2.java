package exercice_5;

public class LecteurMail2 extends LecteurMail{

	public LecteurMail2(String expediteur) {
		super(expediteur);
	}
	
	@Override
	public void suivant() { // passe au mail suivant (dans le tableau) 
		if(getNbMails() == 0)
			System.out.println("Pas de mails");
	    else {
	    	setCourant(getCourant() + 1);
	        if(getCourant() == getNbMails())
	        	setCourant(0);
	        lit();
	    } 
	}
}
