package ArrayVariation;

public class DisplayOneMAxOneMIn {
//printing one max then one min alternate of array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 1, 2, 3, 4, 5, 6 };
		//sorting on array in Ascending order .
		// smallest element at 1st position
		
		for (int i = 0; i < a.length - i - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}
		//creating new array 
		int b[] = new int[a.length];
		int index = 0;
		int i = 0;
		int j = a.length - 1;
		while (true) {
			// adding max elment in 1st position so on 
			b[index++] = a[j];
			j--;
			if (i > j) { 
				//until i  >>> j
				break;

			}
			// adding min element at 2nd position so on
			b[index++] = a[i];
			i++;
			if (i > j) {
				break;

			}

		}
		for (int n : b) {
			System.out.print(n + " ");
		}

	}

}
