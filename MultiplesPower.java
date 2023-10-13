package hefshineVariation;

public class MultiplesPower {
// calculate sum of all natural numbers (num) which is divisible by 3 or 7 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =100;
		int sum=0;
		for (int i = 3; i < num; i++) {
			if (i%3==0 || i%7==0) {
				sum+=i;
				
			}
			
		}
		System.out.println("Sum of "+num +" natural number is "+sum);
	}

}
