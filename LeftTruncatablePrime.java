package hefshineVariation;
/* A Left-truncatable prime is a prime which in a given base 
 * (say 10) does not contain 0 and which remains prime 
 * when the leading ("left") digit is successively removed.
 *  For example, 317 is left-truncatable prime since 317,
 *   17 and 7 are all prime. There are total 4260 left-truncatable primes. 
 *   The task is to check whether the given number (N >0) is left-truncatable prime or not
*/
public class LeftTruncatablePrime {

	public static void main(String[] args) {

		int num = 3107;

		boolean result = iscontainsZero(num);
		if (result) {
			System.out.println("Not truncatable prime");

		} else {
			result = (boolean) truncatablePrime(num);
			if (result) {
				System.out.println("truncatable prime");

			} else {
				System.out.println("Not truncatable prime");

			}

		}

	}// 1st method to call

	public static boolean iscontainsZero(int num) {
		while (num != 0) {
			int r = num % 10;
			num /= 10;
			if (r == 0) {
				return true;

			}

		}
		return false;
	}

	private static boolean truncatablePrime(int num) {
		while (true) {
			boolean result = isPrime(num);
			if (result == false) {
				return false;
			}
			num = cutTheDigit(num);
			if (num == 0) {
				return true;
			}
		}
	}

	private static int cutTheDigit(int num) {
		int digitCount = 0;
		int temp = num;
		while (temp > 0) {
			temp /= 10;
			digitCount++;

		}
		digitCount--;
		int div = (int) Math.pow(10, digitCount);
		int rem = num%div;
		return rem;
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
