class forLoop {
	public static void main(String[] args) {

		int i = 1;
		int num = 1;

		for (i = 1; i <= 5; i++) {
			if (i == 1 || i == 9 || i == 10)
				continue;
			System.out.printf("10000 at %3d interest = %5d\n", i, (int) calculateInterest(10000, i));
		}

		while (i <= 10) {
			if (i == 1 || i == 9 || i == 10) {
				i++;
				continue;
			}

			System.out.printf("10000 at %3d interest = %5d\n", i, (int) calculateInterest(10000, i));
			i++;
		}

		// <Prime Segment>
		System.out.println("checking from 1 to 50 ");
		while (num < 50) {
			if (isPrime(num) == true)
				System.out.println(num + "  is Prime");
			num++;
		}
		// <Prime Segment\>

	}

	public static double calculateInterest(double ammount, double rate) {
		return (ammount * (rate / 100));
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

}
