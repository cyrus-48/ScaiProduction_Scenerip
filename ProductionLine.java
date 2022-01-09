package cat210;

public class ProductionLine {
	Screen sc = new Screen("400 X 700", 30, 40);
	MoviePlayer mp = new MoviePlayer(null, sc, null);
	AudioPlayer ap = new AudioPlayer(null, null);

}
