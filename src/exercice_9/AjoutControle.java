package exercice_9;

public class AjoutControle implements StrategieAjout {
	
    public void ajoute(HeuresEnseignement type, int heures, Service s){
        if(type.getCoeff() * heures + s.heuresEqTDEffectuees() <= s.getHeuresDues())
            type.ajoute(heures);
        else
            System.out.println("Trop d'heures");
    }
    
}
