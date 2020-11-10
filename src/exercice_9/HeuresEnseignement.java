package exercice_9;

public abstract class HeuresEnseignement {

	private int qte;
    private double coeff;
    
    public HeuresEnseignement(double coeff) { 
    	this.coeff = coeff; 
    }
    
    public int getQte() { 
    	return qte; 
    }
    
    public void ajoute(int h) { 
    	qte = qte + h;
    }
    
    public double getCoeff() { 
    	return coeff; 
    }
    
}
