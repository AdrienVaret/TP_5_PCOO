package exercice_2;

public class Roi {

	private String name;
	
	private static Roi roi;
	
	private Roi(String name) {
		this.name = name;
		newInstance(name);
	}
	
	public static Roi getInstance() {
		return roi;
	}
	
	public static void newInstance(String name) {
		roi = new Roi(name);
	}
	
	public String getName() {
		return name;
	}
}
