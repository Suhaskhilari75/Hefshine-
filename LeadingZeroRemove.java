package StringDatatype;
//string variation 
// remove zero leading element from string 
public class LeadingZeroRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "000001230569";
		String s = "";
		boolean flag = false;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (flag == false) {
				if (ch != '0') {
					flag = true;
				}
			}
			if (flag) {
				s = s + ch;
			}

		}
		System.out.println(s);

	}

}
