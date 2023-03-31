package eip.lightsensor;

import java.util.Random;

/***
 * 
 * Cette classe permet de simuler un détecteur de mouvement et qui, aléatoirement, simule l'arrivé ou la sortie 
 * d'une personne dans la pièce.
 * 
 * @author clem6
 *
 */
public class MotionSensor {
	//Nous allons créer un nouvel évenement random
    private Random random = new Random();

    //Nous détectons un nouveau mouvement.
    public boolean detectMotion() {
        // Simule une détection de mouvement aléatoire
        return random.nextBoolean();
    }
}
