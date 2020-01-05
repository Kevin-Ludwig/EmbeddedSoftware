
public class Register {

	int[] reg, regFirstBit, shiftOut;

	public Register(int[] reg, int[] regFirstBit, int[] shiftOut) {
		this.reg = reg;
		this.regFirstBit = regFirstBit;
		this.shiftOut = shiftOut;
	}

	public int step() {
		int sumOut = 0;
		int firstBit = 0;

		for(int i = 0; i < regFirstBit.length; i++) {
			firstBit = firstBit ^ reg[regFirstBit[i] - 1];
		}

		for(int i = 0; i < shiftOut.length; i++) {
			sumOut = sumOut ^ reg[shiftOut[i] - 1];
		}

		System.arraycopy(reg, 0, reg, 1, reg.length-1);			//shift
		reg[0] = firstBit;

		return sumOut;		
	}
	
}
