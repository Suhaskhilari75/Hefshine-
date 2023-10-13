package hefshineVariation;
//abundant number is a number which sum of proper factors is greater than that num .
//and abundance is diff between sum and that num ;
//if abundant print yes otherwise no
public class IsAbundantNum {

	public static void main(String[] args) {
		int n=21;
		int sum=0;
		for (int i = 1; i <=n/2; i++) {
			if (n%i==0) {
				sum+=i;
			}
		}
		if (sum>n) {
			System.out.println("Yes");
			
		}
		else {
			System.out.println("no");
		}

	}

}
