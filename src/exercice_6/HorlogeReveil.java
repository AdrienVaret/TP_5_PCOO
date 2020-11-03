package exercice_6;

import java.util.LinkedList;

public class HorlogeReveil {

	private int heures;
	private int minutes;
	private int secondes;
	private Reveil fonctionReveil;
	
	private LinkedList<Observateur> observateurs = new LinkedList<Observateur>();
	
	public HorlogeReveil() {
		fonctionReveil = new Reveil();
	    ajouteObservateur(fonctionReveil);
	}
	
	public int getHeures() { return heures; }
	public int getMinutes() { return minutes; }
	public int getSecondes() { return secondes; }
	public Reveil getReveil() { return fonctionReveil; }
	
	
	public void regleHeure(int h, int m, int s) {
		heures = h;
		minutes = m;
	    secondes = s;
	}
	
	public void tictac() {
		secondes = (secondes + 1) % 60;
	    if(secondes == 0) {
	    	minutes = (minutes + 1) % 60;
	    	if(minutes == 0)
	    		heures = (heures + 1) % 24;
	    }
	    previentToutLeMonde();
	}
	    
	public void ajouteObservateur(Observateur x){
		observateurs.add(x);
	}
	
	public void previentToutLeMonde(){
		for(Observateur x : observateurs)
			x.miseAJour(this);
	}
	
}
