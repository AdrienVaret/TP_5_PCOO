package exercice_6;

public class Reveil implements Observateur{

	private int heureReveil;
    private int minuteReveil;
    private boolean reveil;
    private SonReveil son;
    private ModeReveil mode = ReveilEteint.INSTANCE;
    
    public void setReveil(boolean b) { reveil = b; }
    
    public void setSonReveil(SonReveil choix) { son = choix; }
    
    public void regleReveil(int h, int m) {
        heureReveil = h;
        minuteReveil = m;
    }
    
    public void basculeReveil(){
        mode = mode.next(this);
    }
    
    public void sonOff() { son.off(); }
    public void sonOn() { son.on(); }
    
    public void miseAJour(HorlogeReveil h) {
      if(reveil && h.getHeures() == heureReveil &&
         h.getMinutes() == minuteReveil && h.getSecondes() == 0)
    	  son.on();
}
}
