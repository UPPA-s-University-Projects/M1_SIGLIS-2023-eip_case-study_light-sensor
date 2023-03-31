package eip.lightsensor.interfaces;

/***
 * 
 * Cette interface permet d'intégrer le design pattern PubSub et sera connectée à notre classe Listener qui
 * écoutera pour l'arrivé de nouveaux messages de notre Producer (ici le sensor)
 * S'il reçoit un message, nous allons faire une action, ici allumer ou éteindre la lumière.
 * 
 * @author clem6
 *
 */
public interface PubSubMessageListener {
	//L'action à faire lors de la réception d'un message
    void onMessageReceived(String message);
}
