package StringVariation_School_level_7;

public class Array_contains_element {
	/*
	 * An array containing positive elements is given. ‘A’ and ‘B’ are two numbers
	 * defining a range. Write a function to check if the array contains all
	 * elements in the given range. Examples :
	 * 
	 * 
	 * Input : arr[] = {1 4 5 2 7 8 3} A : 2, B : 5 Output : false
	 * 
	 * i/p : int[] a= {4, 5, 2, 3,3,5}; o/p : true
	 */

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 8, 3 };

		int start_range = 0;
		int end_range = 10;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= end_range && a[i] >= start_range) {
				count++;
			} else {
				System.out.println(false);
				break;
			}

		}
		if (count == a.length) {
			System.out.println(true +" all elements contains");
		}

	}

}
