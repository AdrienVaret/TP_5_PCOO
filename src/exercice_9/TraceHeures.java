package exercice_9;

public class TraceHeures extends Service {
	
    private Service s;
 
    public TraceHeures(Service s){
        super(0, null, null);
        this.s = s;
    }
    
    public HeuresCours getHeuresCours() { 
    	return s.getHeuresCours(); 
    }
    
    public HeuresTD getHeuresTD() { 
    	return s.getHeuresTD(); 
    }
    
    public HeuresTP getHeuresTP() { 
    	return s.getHeuresTP(); 
    }
    
    public int getHeuresDues() { 
    	return s.getHeuresDues(); 
    }
    
    public void ajoute(HeuresEnseignement type, int h){
        s.ajoute(type, h);
        System.out.println("hEqTD:" + heuresEqTDEffectuees());
    }
    
    public int heuresEqTDEffectuees() {
    	return s.heuresEqTDEffectuees();
    }
    
}
