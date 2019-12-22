
public class Main {

	public static void main(String[] args) {

		Reader reader = new Reader();
		int[] gpsSignal =  reader.read("res/gps_21.txt");	// reader.read(args[0]) ## cmd: java Main gps_21.txt

		GoldCodeGenerator gc = new GoldCodeGenerator();
		gc.createSatelliteCodes();

	}

}
