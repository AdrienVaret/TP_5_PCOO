package exercice_6;

public class SonReveilBuzzer extends Buzzer implements SonReveil{

	@Override
	public void off() {
		super.stoppe();
	}

	@Override
	public void on() {
		super.demarre();
	}

}
