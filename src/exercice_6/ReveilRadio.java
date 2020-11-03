package exercice_6;

public class ReveilRadio implements ModeReveil{

	public static ReveilRadio INSTANCE = new ReveilRadio();
	
	@Override
	public ModeReveil next(Reveil reveil) {
		return ReveilEteint.INSTANCE;
	}

}
