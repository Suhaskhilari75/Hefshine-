package hefshineVariation;

//input number=4;input p =2; find power of p 
public class PowerofPrimeInfacto {

	public static void main(String[] args) {
		int num = 10;
		int p = 2;
		int fact = 1;
		// here we find factorial 
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		int counter = 0;
		while (true) {
			// int rem = fact % p;
			// fact = fact / p;

			if (fact % p == 0) {
				fact = fact / p;// right way to fact
				counter++;

			} else {
				break;
			}

		}
		System.out.println(counter);

	}

}
