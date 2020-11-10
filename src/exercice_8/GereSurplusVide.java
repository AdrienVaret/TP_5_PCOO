package exercice_8;

public class GereSurplusVide implements GestionnaireSurplus{
	
	@Override
	public void gereSurplus(CiterneLimitee citerne) {
		citerne.vide(citerne.getQuantite() - citerne.getQuantiteMax());
	}
}
