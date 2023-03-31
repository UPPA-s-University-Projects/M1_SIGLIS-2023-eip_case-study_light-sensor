package eip.lightsensor;

/*
 * Une simple lumière "informatique" qui symbolise une lumière physique.
 */
public class Light {
	private String nom;
    private boolean isOn;

    public Light(String nom) {
    	this.nom=nom;
    }
    
    public void turnOn() {
        isOn = true;
        System.out.println("La lumière " + nom + " est allumée.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("La lumière " + nom + " est éteinte.");
    }
}
