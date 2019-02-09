class Test_data_type {
	public static void main(String[] args) { 

		// Testing "short", "int", "byte", "long" .

		short myshortvalue = 20, short_total;
		int myminvalue = 50;
		byte mybytevalue = 10;
		long mylongvalue = (50000L + 10L * (myshortvalue + myminvalue + mybytevalue));

		/*
		 * we don't need to type cast here JAVA's automatically converting the result of
		 * the expression in data type LONG.
		 */

		short_total = (short) (1000 + 10 * (myshortvalue + myminvalue + mybytevalue));

		/*
		 * Here for "SHORT" data type we need type cast because java converts the result of
		 * the expression into integer when the expression is of data type "SHORT".
		 */

		System.out.println(myshortvalue / 2);
		System.out.println(myminvalue / 2);
		System.out.println((byte) (mybytevalue / 2) * 2);

		/*
		 * Here for "BYTE" data type we need type cast because java converts the result of
		 * the expression into integer when the expression is data of type "BYTE".
		 */

		System.out.println("mylongtotal = " + mylongvalue);
		System.out.println("myshorttotal = " + short_total);
		System.out.println("Everything is fine. ");

		// Testing "float", and "double" .

		int myintvalue_2 = 5 / 3;
		float myfloatvalue = 5f / 3f, myfloatvalue_2 = (float) 5.25, myfloatvalue_3 = 5.35f;

		/*
		 * To assign a value with or without decimal points in float type variable you
		 * have to put put f at the end of the value and alos if you assign a value with
		 * decimal point you can type cast it into float.
		 */

		double mydoublevalue = 5d / 3d;
		/*
		 * because JAVA will automatically assume that the number that you entered with
		 * a decimal point is a double To assign a value without decimal points in
		 * double type variable you have to put put d at the end of the value.
		 */

		System.out.println("myintvalue =" + myintvalue_2);
		System.out.println("myfloatvalue =" + myfloatvalue);
		System.out.println("mydoublevalue =" + mydoublevalue);

		System.out.println("myintvalue =" + myintvalue_2 + ", myfloatvalue =" + myfloatvalue + ", mydoublevalue ="
				+ mydoublevalue + " (All together within println)");

		// POUND to KILOGRAM conversion

		int pound = 200;
		double POUND_in_KILO = 0.45359237;

		System.out.println(
				"The given value of Pound in Kilo is(with less precission): " + (float) POUND_in_KILO * (float) pound);
		System.out.println("The given value of Pound in Kilo is(with more precission): "
				+ (double) POUND_in_KILO * (double) pound);
		System.out.printf("The given value of Pound in Kilo is(with more precission): %3.16f\t(using printf)\n",
				(double) POUND_in_KILO * (double) pound);
		System.out.printf("The given value of Pound in Kilo is(with more precission): %3.7f\t(using printf)\n",
				(float) POUND_in_KILO * (float) pound);

		// Testing "char" and "boolean"

		/*
		 * We can also assign unicode character into a "char" type variable, but that
		 * unicode has to be followed by a "\"(backslash).
		 */

		char Unide_char_R = '\u00AE', Unide_char_C = '\u00A9';

		/*
		 * We can also assign unicode character into a "char" type variable, but that
		 * unicode has to be followed by a "\"(backslash).
		 */

		boolean one = true, zero = false;

		System.out.printf("Unicode Character output:  %c\t%c\n", Unide_char_C, Unide_char_R);
		System.out.println("Boolean TRUE= " + one);
		System.out.println("Boolean FALSE= " + zero);

		// Finally the "string" data type, not a primitive data type but a class

		String myString = "You are the problem ", myMarks = "I got a poor mark in my maths test which is  ";
		System.out.println("myString= " + myString);
		myString += "and you are the solution.";
		System.out.println("myString= " + myString);
		System.out.printf("%s", myMarks + myminvalue);

		/* JAVA is pretty smart right ? */

	}

}