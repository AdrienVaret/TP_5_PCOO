package exercice_4;

public class Concat implements ExpRegBinaire{

	private ExpReg expression1;
	private ExpReg expression2;
	
	public Concat(ExpReg expression1, ExpReg expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	@Override
	public String toString() {
		return "(" + expression1.toString() + "." + expression2.toString() + ")";
	}
	
}
