package hefshineVariation;

public class RepetativeAddition {

	public  static int sum(int num) {
		int summ = 0;
		while (num != 0) {
			int r = num % 10;
			summ += r;
			num /= 10;
		}
		return summ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		while(num>9) {
			num=sum(num);
		}
		System.out.println(num);
		
		

	}

}
