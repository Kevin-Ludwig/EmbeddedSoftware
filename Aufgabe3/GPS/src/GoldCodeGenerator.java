
public class GoldCodeGenerator {

	private int [][] satellites = new int[][]{
		{2, 6},		// 1
		{3, 7},		// 2
		{4, 8}, 	// 3
		{5, 9}, 	// 4
		{1, 9},		// 5
		{2, 10},	// 6
		{1, 8}, 	// 7
		{2, 9}, 	// 8
		{3, 10}, 	// 9
		{2, 3}, 	// 10
		{3, 4}, 	// 11
		{5, 6}, 	// 12
		{6, 7}, 	// 13
		{7, 8}, 	// 14
		{8, 9}, 	// 15
		{9, 10}, 	// 16
		{1, 4}, 	// 17
		{2, 5}, 	// 18
		{3, 6}, 	// 19
		{4, 7}, 	// 20
		{5, 8}, 	// 21
		{6, 9}, 	// 22
		{1, 3}, 	// 23
		{4, 6}  	// 24
	};


	public int[][] createSatelliteCodes() {
		int[][] satelliteCodes = new int[24][1023];

		for (int i = 0; i < satellites.length; i++) {
			Register reg1 = new Register(new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{3,10}, new int[]{10});
			Register reg2 = new Register(new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{2,3,6,8,9,10}, satellites[i]);

			for (int j = 0; j < 1023; j++) {
				int sumReg1 = reg1.step();
				int sumReg2 = reg2.step();

				if((sumReg1 ^ sumReg2) == 0) {
					satelliteCodes[i][j] = -1;
				} else {
					satelliteCodes[i][j] = 1;
				}
			}
		}
	//	checkRegisters(satelliteCodes);
		return satelliteCodes;
	}

	
	public void checkRegisters(int[][] codes) {			//print only for testing
		for (int i = 0; i < codes.length; i++) {
			System.out.print("Code " + i + ": ");

			for (int j = 0; j < codes[i].length; j++) {
				System.out.print(codes[i][j]);
			}
			System.out.println();
		}
	}

}
