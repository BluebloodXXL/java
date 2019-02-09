class primeCheck {
	public static void main(String[] args) {
		int num = 1;

		System.out.println("checking from 1 to 50 ");
		while (num < 1500000) {
			if (isPrime(num) == true)
				System.out.printf("%8d  is Prime\n", num);
			num++;
		}
	}

	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num);  i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}
