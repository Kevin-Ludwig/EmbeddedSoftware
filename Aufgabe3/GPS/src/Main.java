
public class Main {

	public static void main(String[] args) {

		Reader reader = new Reader();
		int[] gpsSignal =  reader.read("res/gps_17.txt");	
		//	int[] gpsSignal =  reader.read(args[0]);	// cmd: java Main gps_21.txt

		GoldCodeGenerator gc = new GoldCodeGenerator();
		int[][] satelliteCodes = gc.createSatelliteCodes();

		Decoder decoder = new Decoder();
		for(int satID = 0; satID < satelliteCodes.length; satID++) {
			decoder.decode(gpsSignal, satelliteCodes[satID], satID);
		}
	}
}
