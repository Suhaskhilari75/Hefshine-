package hefshineVariation;

import java.util.ArrayList;

public class RecamansSeq {

	public static void main(String[] args) {
		int n = 0;
		int counter=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (counter <20) {
			if (n == 0) {
				System.out.println(0);
				list.add(0);

			} else {
				int lastNum = list.get(list.size() - 1);
				if (lastNum - n > 0 && !list.contains(lastNum- n)) {
					System.out.println(lastNum-n);
					list.add(lastNum - n);
				} else {
					System.out.println(lastNum + n);
					list.add(lastNum + n);

				}
			}
			counter++;
			n++;
		}

	}

}
