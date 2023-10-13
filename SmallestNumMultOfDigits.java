package hefshineVariation;

/* find smallest number whose 
 * digits multiply to a given number n given a number n find smallest number p such that if we 
 * multiply all digits of p we get n . the result p should have minimum 2 digits  */
public class SmallestNumMultOfDigits {

	public static void main(String[] args) {
		int n = 100;//output 455
		int p = 10;
		while (true) {
			int ans = getDigitMult(p);
			if (ans == n) {
				System.out.println(p);
				break;
			}
			p++;

		}

	}

	private static int getDigitMult(int p) {
		// TODO Auto-generated method stub
		int mult = 1;
		int r;
		while (p != 0) {
			r = p % 10;
			mult = mult * r;
			p /= 10;

		}

		return mult;
	}

}
