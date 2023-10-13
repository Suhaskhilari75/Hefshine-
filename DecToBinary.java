package hefshineVariation;

public class DecToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		String string=" ";

		while (num > 0) {

			int rem = num % 2;
			string=string+rem;
			System.out.print(rem);
			num = num / 2;
			
		}
		System.out.println(string);
		char []ca;
		
		
		
	}

}
