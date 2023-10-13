package StringVariation_School_level_7;

public class Smallest_number {

	public static void main(String[] args) {
		/*
		 * Smallest number
		 * 
		 * The task is to find the smallest number with given sum of digits as S and
		 * number of digits as D.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: S = 9 D = 2 Output: 18 Explanation: 18 is the smallest number possible
		 * with sum = 9 and total digits = 2.
		 */
		int sum = 9;
		int total_digits = 2;
		int start = (int) Math.pow(10, total_digits - 1);
		int end = (int) Math.pow(10, total_digits);
		for (int i = (int) Math.pow(10, start); i < end; i++) {
			int result = sum_digit(i);
			if (result == sum) {
				System.out.println("Minimum  numbers whose sum of digits is " + sum + " ==> " + i);
				break;
			}
		}

	}

	private static int sum_digit(int i) {
		int sum = 0;
		while (i != 0) {
			int r = i % 10;
			sum += r;
			i /= 10;

		}
		return sum;
	}

}
