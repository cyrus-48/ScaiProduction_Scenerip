package cat210;
// a driver class to test the functionality of the movie player class
public class Driver_MoviePlayer extends MoviePlayer {
 // constructor to initialize values from the super class.
	public Driver_MoviePlayer(String name, Screen screen, MonitorType monitorType) {
		super(name, screen, monitorType);
		 
	}
	public static void main(String args[]) {
		Driver_MoviePlayer mp = new Driver_MoviePlayer("ScaiProduction", screen, monitorType.LCD);
		 
		 mp.play();
		 mp.next();
		 mp.previous();
		 mp.stop();
	      
		
	}

}
