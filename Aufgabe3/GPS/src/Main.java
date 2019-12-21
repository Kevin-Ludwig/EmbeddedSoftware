
public class Main {

	public static void main(String[] args) {

		Reader reader = new Reader();
		int[] gpsSignal =  reader.read("res/gps_21.txt");	// reader.read(args[0]) ## cmd: java Main gps_21.txt

		for(int i = 0; i < gpsSignal.length; i++) {
			System.out.print(gpsSignal[i] + "|");
		}
		System.out.println("\n-------------------------------------------------------");

		
		GoldCodeGenerator gc = new GoldCodeGenerator();
		gc.createSatelliteCodes();
		

	}

}
