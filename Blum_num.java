/*Blum Integer
Blum Integer is a semi-prime number, suppose p and q are the two factors (i.e. n = p * q),
 they(p and q)
 are of the form 4t + 3, where t is some integer. 
First few Blum Integers are 21, 33, 57, 69, 77, 93, 129, 133, 141, 161, 177, …

Note: Because of the condition that both the factors should be semi-primes,
 even numbers can not be Blum integers neither can be the numbers below 20, 
So we have to check only for an odd integer greater than 20 if it is a Blum Integer or not.*/
//3,7,11/15/19/23/27/41
package hefshineVariation;

public class Blum_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=77;
		
		for (int i = 2; i <=num; i++) {
			if(num%i==0) {
				//System.out.println(i);
				if (i==(4*i+3)) {
					System.out.println(i);
					break;
				}
			}
			
		}

	}

}
