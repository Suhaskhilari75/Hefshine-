package StringDatatype;

public class ShiftZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0003001230569";
		String s2 = "";
		String s2zero = "";
		String s2Nonzero = "";
		for (int i = 0; i < s.length(); i++) {
			// char ch = s.charAt(i);
			if (s.charAt(i) == '0') {
				s2zero = s2zero + s.charAt(i);
			} else {
				s2Nonzero = s2Nonzero + s.charAt(i);
			}
		} // zeroes shift to left
			// s2 = s2zero + s2Nonzero;

		// zeroes to right side
		s2 = s2Nonzero + s2zero;
		System.out.println(s2);
	}

}
