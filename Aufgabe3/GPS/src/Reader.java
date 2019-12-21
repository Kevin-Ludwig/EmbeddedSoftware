import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Reader {


	public int[] read(String path) {

		String input = null;

		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr); 
			input = br.readLine();
			br.close();
		} catch (IOException e) {
			System.out.println("Can't open file, cancel program!");
			System.exit(0);
		}

		String[] splitter = input.split(" ");
		int[] gpsSignal = new int[splitter.length];

		for (int i = 0; i < gpsSignal.length; i++) {
			gpsSignal[i] = Integer.parseInt(splitter[i]);
		}
		return gpsSignal;
	}

}
