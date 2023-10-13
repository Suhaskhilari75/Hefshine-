package hefshineVariation;
//find sum of proper divisors of number ;
public class SumOFProperDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
		int sum=0;
		for (int i = 1; i <num; i++) {
			if (num%i==0) {
				//System.out.println(i);
				sum+=i;
				
			}
		}
		System.out.println(sum);

	}

}
