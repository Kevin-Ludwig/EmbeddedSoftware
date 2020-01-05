
public class Decoder {

	private int[] gpsSignal;
	private int[][] satCodes;

	
	public Decoder(int[] gpsSignal, int[][] satCodes) {
		this.gpsSignal = gpsSignal;
		this.satCodes = satCodes;
	}
	
}
