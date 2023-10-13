package hefshineVariation;

public class FindModOFremainder {

	public static void main(String[] args) {
		int a = 21;
		int b = 5;
		int x;
		System.out.print("factors of a such that remainder get 5  is ");
		for (x = 1; x <= 21; x++) {
			if (a % x == b) {
				System.out.print(x + " ");

			}
		}

	}

}
