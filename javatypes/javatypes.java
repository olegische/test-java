class Types {

    public static void main(String[] args) {
        // Prints her znaen chto to the terminal window.

        double x1 = 122.46 - 17.47;
		float x2 = (float)x1-3;
		long x3 = 100L+8;
		int x4 = (int)x3;
		char x5 = 'o';
		byte x6 = '!';

		// double result = 0.0;
		String result = "";
		result+=(char)x1;
		result+=(char)x2;
		result+=(char)x3;
		result+=(char)x4;
		result+=(char)x5;
		result+=(char)x6;
		System.out.println(result);
    }

}