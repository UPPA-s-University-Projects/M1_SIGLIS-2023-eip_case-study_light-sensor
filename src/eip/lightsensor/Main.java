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
	        Light light = new Light();
	        
	        //Nous créons un nouveau lightController et lui attachons la lumière. 
	        LightController lightController = new LightController(light);
	        
	      //Nous créons un sensor 
	        MotionSensor motionSensor = new MotionSensor();

	        //Nous abonnons le lightController à notre liste d'abonnées
	        pubSubService.subscribe(lightController);

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
