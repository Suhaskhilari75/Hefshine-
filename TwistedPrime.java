package StringVariation;

import java.util.Scanner;

public class TwistedPrime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scanner.nextInt();
		if (isprime(number)) {
			int result = rev(number);

			if (isprime(result)) {
				System.out.println(number + " is a twisted prime.");
			} else {
				System.out.println(number + " is not a twisted prime.");
			}
		} else {
			System.out.println(number + " is not a twisted prime.");
		}

	}

	private static int rev(int number) {
		int revv = 0;
		while (number != 0) {
			int r = number % 10;
			revv = revv * 10 + r;
			number /= 10;
		}
		return revv;
	}

	public static boolean isprime(int n) {
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
