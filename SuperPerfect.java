package hefshineVariation;
//check whether the num is Superperfect or not .
//superperfect is sum of factor of (sum of fact)==2*num;
public class SuperPerfect {

	public static void main(String[] args) {
		int n=16;
		int sfn=Sfcal(n);
		int sfsfn=Sfcal(sfn);
		if (sfsfn==2*n) {
			System.out.println("Yes ");
			
		}
		else {
			System.out.println("no");
		}

	}
	public static int  Sfcal(int n) {
		int sum=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				sum+=i;
				
			}
			
		}
		return sum;
	}

}
