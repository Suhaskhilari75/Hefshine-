package hefshineVariation;

import java.util.Arrays;

import helfshine.isAmicable_num;

public class ZeroAtEnding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 20, 3, 0, 0, 0, 6 };
		int start = -1;
		int end = 0;
		int i = 0;
		int zeroOrNonZero = 0;
		while (i < a.length) {
			if (zeroOrNonZero == 0) {
				// zerocheking
				if (a[i] == 0) {
					start = i;
					zeroOrNonZero = 1;
				}

			} else {
				// nonZeroCheking
				end = i;
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				i = start;
				zeroOrNonZero = 1;

			}
			i++;

		}
		System.out.println(Arrays.toString(a));

	}

}
