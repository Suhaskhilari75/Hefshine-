package StringDatatype;

public class SumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="2a6b8";
		int sum=0;
		for (int i = 0; i < string.length(); i++) {
			 if (string.charAt(i)>='0' && string.charAt(i)<='9') {
				int num=string.charAt(i)-48;
				// ASCII value of 0 is 48
				sum+=num;
			}
		}
		System.out.println(sum);

	}

}
