
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

	int[][] satellitesCodes = new int[24][1023];



	public void createSatelliteCodes() {

		for (int i = 0; i < satellites.length; i++) {
			Register reg1 = new Register(new int[]{1,1,1,1,1,1,1,1,1,1}, new int[]{3,10}, new int[]{10});

		}
	}

}
