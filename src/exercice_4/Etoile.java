package exercice_4;

public class Etoile implements ExpReg{

	private ExpReg expression;
	
	public Etoile(ExpReg expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return "(" + expression.toString() + ")*";
	}
}
