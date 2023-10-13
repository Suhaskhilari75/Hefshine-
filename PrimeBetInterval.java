package hefshineVariation;

public class PrimeBetInterval {
//some problem in running
	public static void main(String[] args) {
		int low = 3;
		int high = 100;
		int count = 0;
		for (int i = low; i <= high; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;

				}

			}
			if (count == 0) {
				System.out.println(i);
			}

		}

	}

}
