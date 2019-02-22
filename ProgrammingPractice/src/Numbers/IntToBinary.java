package Numbers;

class IntToBinary {

	public static void main(String[] args) {

		int a = 5;
		int rem = 0;

		while (a > 0) {
			rem = a % 2;
			a = a / 2;

			System.out.println(rem);
		}

	}
}