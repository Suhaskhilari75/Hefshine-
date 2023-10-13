package hefshineVariation;

public class SumOfEvenIndex {
// sum of even index of binomial coefficient ;
	public static void main(String[] args) {
		int n = 6;
		//int max = 0;
		int sum = 0;
		int nfact = fact(n);// factorial of n calculate here..

		for (int r = 0; r <= n; r += 2) {
			int nrfact = fact(n - r);// n-r !
			int rfact = fact(r);// r!
			int ans = nfact / (nrfact * rfact); // n! /r!*(n-r)!
			sum = sum + ans;
		}
		System.out.println("The sum of even index binomial coeficient is : " + sum);

	}

	public static int fact(int n) { // factorial calculate method
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;

	}

}
