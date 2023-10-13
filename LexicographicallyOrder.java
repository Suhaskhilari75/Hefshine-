package StringDatatype;

public class LexicographicallyOrder {

	public static void main(String[] args) {
//sorting string
		//String string = "c 1fg hijk";
		String string = "abc abdefg hijk";
		String sa[] = string.split(" ");
		// split by spaces
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				// ascending
				if (sa[i].compareTo(sa[j]) > 0) {
					// swapping
					String tempString = sa[i];
					sa[i] = sa[j];
					sa[j] = tempString;
				}
			}
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		

	}

}
