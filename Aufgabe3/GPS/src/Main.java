
public class Main {

	public static void main(String[] args) {

		// cmd: java Main gps_21.txt

		Reader reader = new Reader();
		int[] gpsSignal =  reader.read("res/gps_21.txt");
		//	int[] gpsSignal = reader.read(args[0]);

		for(int i = 0; i < gpsSignal.length; i++) {
			System.out.println(gpsSignal[i]);
		}

	}

}
