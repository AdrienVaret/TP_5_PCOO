package exercice_9;

public class ServicePermanent extends Service{
	
	public ServicePermanent() {
        super(192, new HeuresTPPermanent(), new AjoutNonControle());
    }
	
    public boolean serviceFait() {
        return heuresEqTDEffectuees() >= getHeuresDues();
    }
    
    public int nbHeuresSup() {
        int h = heuresEqTDEffectuees() - getHeuresDues();
        if(h > 0)
            return h;
        else
            return 0;
    }

}
