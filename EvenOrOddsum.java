package hefshineVariation;

public class EvenOrOddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5

		};
		int evenSum=0;
		int oddSum=0;
		
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				evenSum+=a[i];
			}
			else {
				oddSum+=a[i];
			}
		}
		System.out.println(evenSum+" "+oddSum);

	}

}
