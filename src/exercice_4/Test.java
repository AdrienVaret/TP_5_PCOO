package exercice_4;

public class Test {

	public static void testQuestion1() {
		
		System.out.println("QUESTION 1 :");
		Epsilon e = new Epsilon();
		Symbole a = new Symbole('a'); 
		System.out.println(e.toString()); // affiche: e 
		System.out.println(a.toString()); // affiche: a
		System.out.println("");
	}
	
	public static void testQuestion2() {
		
		System.out.println("QUESTION 2 :");
		Symbole a = new Symbole('a');
		Etoile star = new Etoile(a);
		Etoile star2 = new Etoile(star); 
		System.out.println(star.toString()); // affiche: (a)* 
		System.out.println(star2.toString()); // affiche: ((a)*)*
		System.out.println("");
	}
	
	public static void testQuestion3() {
		
		System.out.println("QUESTION 3 :");
		Concat c = new Concat(new Symbole('a'), new Symbole('b')); 
		Etoile star = new Etoile(new Somme(new Epsilon(), c)); 
		System.out.println(star.toString()); // affiche: ((&+(a.b)))*	 
		System.out.println("");
	}
	
	public static void testQuestion4() {
		
		System.out.println("QUESTION 4 :");
		Epsilon e = (Epsilon) ChaineFactory.creeChaine("");
		Symbole s = (Symbole) ChaineFactory.creeChaine("s");
		Concat abcd = (Concat) ChaineFactory.creeChaine("abcd"); 
		System.out.println(e.toString()); //affiche: e
		System.out.println(s.toString()); //afficher: s
		System.out.println(abcd.toString()); // affiche: (a.(b.(c.d))) 
		System.out.println("");
	}
	
	public static void testQuestion5() {
		
		System.out.println("QUESTION 5 :");
		Symbole a = new Symbole('a');
		Concat c = new Concat(a, new Somme(a, new ConcatLight(a, a))); 
		System.out.println(c.toString()); // affiche: (a.(a+aa))
		System.out.println("");
	}
	
	public static void main(String [] args) {
		
		testQuestion1();
		testQuestion2();
		testQuestion3();
		testQuestion4();
		testQuestion5();
	}
}
