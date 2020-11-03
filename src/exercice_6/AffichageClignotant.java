package exercice_6;

public class AffichageClignotant implements AffichageHeure{

	boolean afficher = true;
	
	@Override
	public void miseAJour(HorlogeReveil h) {
		
		if (afficher)
			System.out.println(h.getHeures() + " : " + h.getMinutes() + " : " + h.getSecondes());
		else
			System.out.println(h.getHeures() + "   " + h.getMinutes() + "   " + h.getSecondes());
		
		afficher = !afficher;
		
	}

}
