package StringDatatype;

public class CheckBinaryString {
	// check whether string contain only binary or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "1010101010";
//		String string = "101abc01010";
		int result = isBinaryContains(string);
		System.out.println(result);

	}

	private static int isBinaryContains(String string) {
		// TODO Auto-generated method stub
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '0' || ch == '1') {

			} else {

				return 0;
			}

		}
		return 1;
	}

}
