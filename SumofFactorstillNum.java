package hefshineVariation;

public class SumofFactorstillNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int sum=0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					sum=sum+j;
					
				}
			}
			
		}
		System.out.println("sum of divisors till n numbers is "+sum);

	}

}
