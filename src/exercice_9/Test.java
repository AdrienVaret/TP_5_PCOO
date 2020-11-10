package exercice_9;

public class Test {

	public static void question4() {	
		ServicePermanent s = new ServicePermanent();
        s.ajoute(s.getHeuresCours(), 100);
        s.ajoute(s.getHeuresTD(), 30);
        s.ajoute(s.getHeuresTP(), 30);
        System.out.println(s.heuresEqTDEffectuees());// affiche "210"
        //System.out.println("Nb heures sup:" + s.nbHeuresSup());
        ServiceMoniteur s2 = new ServiceMoniteur();
        s2.ajoute(s2.getHeuresCours(), 10);
        s2.ajoute(s2.getHeuresTP(), 60);
        s2.ajoute(s2.getHeuresTD(), 30);// affiche "Trop d'heures"
        System.out.println(s2.heuresEqTDEffectuees()); // affiche "55"
	}
	
	public static void main(String [] args) {
		question4();
	}
}
