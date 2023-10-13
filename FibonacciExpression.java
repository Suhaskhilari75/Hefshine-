package hefshineVariation;

public class FibonacciExpression {
// half solve 
	public static void main(String[] args) {
		int n = 5;
		int fnm1 = getfibo(n - 1);
		int fnp1 = getfibo(n + 1);
		int fn = getfibo(n);

		int ans = (fnm1 * fnp1) - fn * fn;
System.out.println(ans);
	}

	private static int getfibo(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		int a = 0;
		int b = 1;
		int Counter = 2;

		while (true) {
			int c = a + b;
			a = b;
			b = c;
			if (Counter == n) {
				return c;
				
			

			}
			return c;

		}

	}

}
