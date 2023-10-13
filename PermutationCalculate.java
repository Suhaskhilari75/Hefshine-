package hefshineVariation;
//calculate permutation  n!/(n-r)!
public class PermutationCalculate {
//in permutation sequence does not matter 
	//in combination its matter  5C2 ??
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int r=2;
	int nfact=fact(n);
	int nrfact=fact(n-r);
	
		System.out.println("The value of  5P2 is "+nfact/nrfact);

	}
	public static int fact(int n) {
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
		return fact;
		
	}

}
