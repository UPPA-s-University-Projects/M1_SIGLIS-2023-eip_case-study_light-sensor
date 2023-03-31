package eip.lightsensor;


/**
 * Notre classe main 
 * 
 * @author clem6
 *
 */
public class Main {
	
	    public static void main(String[] args) throws InterruptedException {
	    	//Nous créons une nouvelle instance de notre classe PubSubService (qui permet de s'occuper des abonnements aux
	    	//évenements pour chaque classe
	        PubSubService pubSubService = new PubSubService();
	        
	        //Nous créons une lumière 
	        Light lightSM = new Light("Salle à manger");
	        
	        //Nous créons un nouveau lightController et lui attachons la lumière. 
	        LightController lightControllerSM = new LightController(lightSM);
	        
	        Light lightCuisine = new Light("Cuisine");
	        
	        LightController lightControllerCuisine = new LightController(lightCuisine);
	        
	      //Nous créons un sensor 
	        MotionSensor motionSensor = new MotionSensor();

	        //Nous abonnons le lightController à notre liste d'abonnées
	        pubSubService.subscribe(lightControllerSM);
	        pubSubService.subscribe(lightControllerCuisine);

	        //On fait tourner aléatoirement le détecteur de mouvement pour simuler la présence ou non de personne
	        while (true) {
	            if (motionSensor.detectMotion()) {
	                pubSubService.publish("DETECT_MOTION");
	            } else {
	                pubSubService.publish("NO_MOTION");
	            }
	            Thread.sleep(1000);
	        }
	    }
	

}
