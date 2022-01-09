package cat210;

public class Driver_AudioPlayer extends AudioPlayer{

	public Driver_AudioPlayer(String name, String audioSpecification) {
		super(name, audioSpecification);
 
	}
	public static void main(String args[]){
		Driver_AudioPlayer a = new Driver_AudioPlayer("BANG-OLUFSEN","VIDEO");
		 String b = a.toString();
		 System.out.println(b);
		 a.play();
		 a.next();
		 a.previous();
		 a.stop();
	}

}
