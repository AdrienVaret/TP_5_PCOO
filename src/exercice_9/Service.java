package exercice_9;

public abstract class Service {
	
	private HeuresCours heuresCours = new HeuresCours();
    private HeuresTD heuresTD = new HeuresTD();
    private HeuresTP heuresTP;
    private int heuresDues;
    private StrategieAjout strategieAjout;
    
    public Service(int h, HeuresTP heuresTP, StrategieAjout strategieAjout) {
        heuresDues = h;
        this.heuresTP = heuresTP;
        this.strategieAjout = strategieAjout;
    }
    
    public HeuresCours getHeuresCours() { 
    	return heuresCours; 
    }
    
    public HeuresTD getHeuresTD() { 
    	return heuresTD; 
    }
    
    public HeuresTP getHeuresTP() { 
    	return heuresTP; 
    }
    
    public int getHeuresDues() { 
    	return heuresDues; 
    }
    
    public void ajoute(HeuresEnseignement type, int h){
        strategieAjout.ajoute(type, h, this);
    }
    
    public int heuresEqTDEffectuees() {
        return (int) (heuresCours.getCoeff() * heuresCours.getQte() + heuresTD.getCoeff() * heuresTD.getQte() + heuresTP.getCoeff() * heuresTP.getQte());
    }
}
