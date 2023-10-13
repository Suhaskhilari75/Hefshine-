package hefshineVariation;

import helfshine.numberOFDivisors;
//find minimum sum of factors of number 
public class MinimumSumOfFactorsOfNum {

	public static void main(String[] args) {
		int n=100;//number
		int temp=n;
		int sum=0;
		int fact=2; 
		while (n>1) { //this will calculate automatically prime number factor and which is minimum
			if (n%fact==0) {
				sum+=fact;
				n/=fact;
				
			}
			else {
				fact++;
			}
			
		}
		System.out.println("minimun Sum of  "+temp+" is "+sum);

	}

}
