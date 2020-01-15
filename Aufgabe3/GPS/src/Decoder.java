import java.util.Arrays;

public class Decoder {

	public Decoder() {

	}

	public void decode(int[] gps, int[] satCode, int satID) {
		int peek = -2 ^ ((1023 + 2) / 2) - 1;

		int[] doubleGps = new int[gps.length * 2];		// dobule gps array
		for(int i = 0; i < gps.length; i++) {
			doubleGps[i] = gps[i];
			doubleGps[1023 + i] = gps[i];
		}

		int maxSum = 0; 
		int maxOffset = 0;

		for (int offset = 0; offset < gps.length; offset++) {
			int[] offsetGps = Arrays.copyOfRange(doubleGps, offset, offset + 1023);
			int sum = product(offsetGps, satCode);

			if (Math.abs(sum) > Math.abs(maxSum)) {
				maxSum = sum;
				maxOffset = offset;
			}
		}

		if(Math.abs(maxSum) > Math.abs(peek)) {
			int sendBit = (maxSum > 0) ? 1: 0;
			System.out.println("Satellite " + (satID + 1) + " has sent bit " + sendBit +
					" (delta = " + (1023 - maxOffset) + ")");
		}
	}


	public int product(int [] array1, int[] array2) {
		int sumOfArrays = 0;
		for(int i = 0; i < array1.length; i++) {
			sumOfArrays	+= array1[i] * array2[i];
		}
		return sumOfArrays;
	}

}
