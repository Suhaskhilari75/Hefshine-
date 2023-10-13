package ArrayVariation;

import java.util.Arrays;

public class Reverse_subarray_of_consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b[] = new int[a.length];
		int k = 3;
		int index = 0;
		

		for (int i = 0; i < a.length; i += k) {
			
			if (index>a.length) {
				index=a.length-1;
			}
			for (int j = i + k - 1; j >= i; j--) {
				b[index++] = a[j];
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
