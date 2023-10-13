package hefshineVariation;
//  print number  between given range  which is  using digit 4 and 7
public class UnitNotPresentBetRange {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 1000; i++) {

			//boolean result = isAcceptable(i);
			//if we dont want that digit then ==false use
			// if we want only that digit then uhh can give true condition . 
			if (isAcceptable(i)==false) { 
				System.out.println(i);

			}
		}

	}

	public static boolean isAcceptable(int n) {

		while (n > 0) {
			int rem = n % 10;
			if (rem != 4 && rem != 7) {
				return false;

			}
			n /= 10;

		}

		return true;

	}

}
