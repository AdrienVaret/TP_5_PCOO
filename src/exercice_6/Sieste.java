package exercice_6;

public class Sieste {

	private HorlogeReveil horloge;
	private boolean sieste;
	
	private int minuteFinSieste;
	private int heureFinSieste;
	
	public Sieste(HorlogeReveil horloge) {
		this.horloge = horloge;
	}
	
	public boolean getSieste() {
		return sieste;
	}
	
	public int getMinuteFinSieste() {
		return minuteFinSieste;
	}
	
	public int getHeureFinSieste() {
		return heureFinSieste;
	}
	
	public void sleep(int m) {
		sieste = true;
		minuteFinSieste = (horloge.getMinutes() + m) % 60;
		heureFinSieste = (horloge.getHeures() + m / 60) % 24;
	}
	
	public void snooze() {
		sleep(9);
	}
}
