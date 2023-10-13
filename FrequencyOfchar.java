package StringDatatype;

public class FrequencyOfchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ababac";
		char ch = 0;
		char ch2 = 0;
		int max = 0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < string.length(); i++) {

			int count = 0;
			for (int j = 0; j < i; j++) {
				if (string.charAt(j) == string.charAt(i)) {
					count++;
					break;

				}
			}
			if (count == 0) {
				int Char_count = 0;
				for (int k = 0; k < string.length(); k++) {
					if (string.charAt(i) == string.charAt(k)) {
						Char_count++;

					}
				}
				if (max < Char_count) {
					max = Char_count;
					ch=string.charAt(i);
				}
				if (min > Char_count) {
					min = Char_count;
					ch2=string.charAt(i);
				}
				System.out.println("frequency of char " + string.charAt(i) + " : " + Char_count);

			}

		}
		System.out.println(ch + " : " + max);
		System.out.println(ch2 + " : " + min);
	}

}
