package Numbers;

public class CountHowManyDigits {

	public static void main(String[] args) {
		int n = 11111;
		int rem = 0;
		int count = 0;

		while (n > 0) {
			rem = n % 10;
			n = n / 10;

			if (rem == 7) {
				count++;
			}
		}

		System.out.println(count);
	}

}
