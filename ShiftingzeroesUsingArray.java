package StringDatatype;
/*Given a string of digits, remove leading zeros from it.

Examples:

Input : 00000123569
Output : 123569*/
public class ShiftingzeroesUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "0003001230569";
		String s2 = "";
		//OR 
		char a[]=string.toCharArray();
		//char a[] = new char[string.length()];
		// adding element to array 
		for (int i = 0; i < a.length; i++) {
			char ch = string.charAt(i);
			a[i] = ch;
		}
		// array swapping element 
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != '0' && a[j] == '0') {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println(a);
//		// array to string shifting 
//		for (char c : a) {
//			s2=s2+c;
//		}
//		System.out.println(s2);
	}

}
