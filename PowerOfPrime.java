package hefshineVariation;

import java.util.ArrayList;
import java.util.Iterator;

public class PowerOfPrime {
	/*
	 * power of prime number p in n! given integer n ,find the power of given prime
	 * number(r) in n!
	 */
	static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		int r = 6; // find factorial
		int n = 3;// find power of n
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a12 = new ArrayList<Integer>();

		int fact = 1;
		for (int i = 1; i <= r; i++) {
			fact *= i;

		}//factorial find here
		
		for (int i = 2; i < fact; i++) {
			if (fact % i == 0) { //factors of factorial num 
				{
					if (isPrime(i)) { //prime factors of factorial number
						//isprime function which return true or false .
						a1.add(i);//adding number to a1 array list

					}
				}

			}

		}
		for (int data : a1) {
			a12.add(0);
			///add zeroes in a12 array at starting
		}
		
		int idx =0;
		while(fact>1) { //if factorial num  =1 loops end;
			int remainder =fact%a1.get(idx);/*factorial num divide by index number
			                          element of array and gives remainder . 720 % 2  ==0*/
			if(remainder==0) {
				fact=fact/a1.get(idx); /*factorial num divide by index number
                                       element of array and stored in fact itself .*/
				a12.set(idx, a12.get(idx)+1);/* if divide successfully then increment by 1 
				                          and stored in idx position of array */
			}
			else {
				idx++;
			}
		}
		System.out.println(a1);
		System.out.println(a12);
		

	}

}
