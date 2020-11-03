package exercice_6;

public class SonReveilRadio extends Radio implements SonReveil{

	@Override
	public void off() {
		super.eteint();
	}

	@Override
	public void on() {
		super.allume();
	}

	
}
