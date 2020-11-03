package exercice_5;

public class TestMail {

	public static void main(String [] args) {
		Mail m1 = null, m2 = null;
		BoiteMailTableau b = new BoiteMailTableau("a@b.c");
		b.recoit(m1);
		b = new Notification(b);
		b.recoit(m2);
	}
}
