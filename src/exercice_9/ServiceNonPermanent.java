package exercice_9;

public abstract class ServiceNonPermanent extends Service {
	
	public ServiceNonPermanent(int h) {
        super(h, new HeuresTPNonPermanent(), new AjoutControle());
    }
}