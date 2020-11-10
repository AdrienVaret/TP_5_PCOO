package exercice_9;

public class AjoutNonControle implements StrategieAjout {
	public void ajoute(HeuresEnseignement type, int heures, Service s){
		type.ajoute(heures);
	}
}
