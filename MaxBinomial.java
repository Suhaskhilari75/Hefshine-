package hefshineVariation;

import helfshine.Factorial;
//find max coefficient in binomial in nCr  nco nc1 nc2 nc3 
public class MaxBinomial {
	//(a+b)^2 =1a^2 + 2ab +1b^2 ....like this here 2 is max coeficient
// for 2 print 1 2 1 
	// for 3 print 1 3 3 1
	
	public static void main(String[] args) {
		int n =5;
		int max = 0;

		int nfact = fact(n);//factorial of n calculate here..
		
		for (int r = 0; r <= n; r++) {
			int nrfact = fact(n- r);//n-r !
			int rfact = fact(r);//r!
			int ans = nfact /(nrfact * rfact); //n! /r!*(n-r)!
			if (ans > max) {
				max = ans;

			}
		}
		System.out.println("The max binomial coeficient is : "+max);

	}

	public static int fact(int n) { //factorial calculate method
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		return fact;
	}

}
