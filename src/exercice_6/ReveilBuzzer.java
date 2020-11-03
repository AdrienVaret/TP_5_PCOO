package exercice_6;

public class ReveilBuzzer implements ModeReveil{

	public static ReveilBuzzer INSTANCE = new ReveilBuzzer();
	
	@Override
	public ModeReveil next(Reveil reveil) {
		return ReveilRadio.INSTANCE;
	}

}
