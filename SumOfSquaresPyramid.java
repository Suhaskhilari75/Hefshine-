package hefshineVariation;
//if pyramidal number then print pyramidal 
// square pyramidal number(sum of squares )
//square  pyramidal number are 1,5,14,30,55,91,140,284,285,385...
public class SumOfSquaresPyramid {

	public static void main(String[] args) {
		int num = 10;
		int input = 55;
		for (int i = 1; i <= num; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				sum = sum + (j * j);

			}
			// System.out.println("sum of s"+sum);
			if (sum == input) {
				System.out.println("sq pyramidal number .");
				break;

			}
			if (sum > input) {	
				System.out.println("-1");
				break;

			}
		}

	}

}
