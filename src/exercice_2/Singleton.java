package exercice_2;

public class Singleton {
	static final private Singleton INSTANCE = new Singleton(); // ... autres attributs
	private Singleton() { /*...*/ }
	public static Singleton getInstance() { return INSTANCE; } // ... autres methodes
}
