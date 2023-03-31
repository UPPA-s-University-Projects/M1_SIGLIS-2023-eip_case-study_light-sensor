package eip.lightsensor;

/*
 * Une simple lumière "informatique" qui symbolise une lumière physique.
 */
public class Light {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("La lumière est allumée.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("La lumière est éteinte.");
    }
}
