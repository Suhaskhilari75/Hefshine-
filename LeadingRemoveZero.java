package StringDatatype;

public class LeadingRemoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//another method
		String string = "000001230569";//remove 1st five zero
		String s = "";
		int i = 0;
		while (true) {
			if (string.charAt(i) == '0') {
				i++;
			}

			else {
				break;
			}
		}
		for (; i < string.length(); i++) {
			s = s + string.charAt(i);

		}
		System.out.println(s);
	}

}
