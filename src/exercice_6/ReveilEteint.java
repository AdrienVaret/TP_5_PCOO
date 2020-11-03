package exercice_6;

public class ReveilEteint implements ModeReveil{

	public static ReveilEteint INSTANCE = new ReveilEteint();

	@Override
	public ModeReveil next(Reveil reveil) {
		return ReveilBuzzer.INSTANCE;
	}
	
}
