package eip.lightsensor;

import eip.lightsensor.interfaces.PubSubMessageListener;

/**
 * 
 * Notre lightController qui nous permet de mieux facilement gérer les actions à faire lros de l'arrivé d'un nouveau 
 * message.
 * Nous implémentons notre interfae PubSubMessageListener
 * 
 * Cette classe contient un lumière qui lui est attaché lors de la création.
 * Dès que nous recevons un message (Override de la méthode de notre interface), nous allons allumer la lumière ou 
 * l'éteindre selon le signal reçu du sensor.
 * 
 * @author clem6
 *
 */
public class LightController implements PubSubMessageListener {
    private Light light;

    public LightController(Light light) {
        this.light = light;
    }

    /**
     * Notre méthode de notre interface PubSubMessageListener
     */
    @Override
    public void onMessageReceived(String message) {
        if ("DETECT_MOTION".equals(message)) {
            light.turnOn();
        } else if ("NO_MOTION".equals(message)) {
            light.turnOff();
        }
    }
}
