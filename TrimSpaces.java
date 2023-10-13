package StringDatatype;

public class TrimSpaces {

	public static void main(String[] args) {

		String string = "         suhas      ";
		String string2 = "";
		// by built in method
		// System.out.println(string.trim());
		int start = 0;
		int end = string.length() - 1;
		while (true) {
			if (string.charAt(start) == ' ') {
				start++;
			} else {
				break;

			}
		}
		while (true) {
			if (string.charAt(end) == ' ') {
				end--;
			} else {
				break;
			}
		}
		System.out.println("start : " + start);
		System.out.println("end : " + end);
		for (int i = start; i <= end; i++) {
			string2 = string2 + string.charAt(i);

		}
		System.out.print(string2);

	}

}
