
public class Register {

	int[] reg, regFirstBit, regOut;

	public Register(int[] reg, int[] regFirstBit, int[] regOut) {
		this.reg = reg;
		this.regFirstBit = regFirstBit;
		this.regOut = regOut;
	}

	public int step() {
		int sumOut = 0;
		int firstBit = 0;

		for(int i = 0; i < regFirstBit.length; i++) {
			firstBit = firstBit ^ reg[regFirstBit[i] - 1];
		}

		for(int i = 0; i < regOut.length; i++) {
			sumOut = sumOut ^ reg[regOut[i] - 1];
		}

		System.arraycopy(reg, 0, reg, 1, reg.length-1);			//shift
		reg[0] = firstBit;

		return sumOut;		
	}
	
}
