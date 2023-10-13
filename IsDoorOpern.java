package StringVariation;

public class IsDoorOpern {

	public static void main(String[] args) {
		int n = 3;
		int door[] = new int[n];

		int person[] = new int[n];
		int id = 1;
		for (int i = 0; i < person.length; i++) {
			person[i] = id++;
		}
		for (int i = 0; i < person.length; i++) {
			for (int j = 0; j < door.length; j++) {
				if ((j + 1) % person[i] == 0) {
					if (door[j] == 0) {
						door[j] = 1;
					} else {
						door[j] = 0;
					}
				}
			}
		}
		for (int i : door) {
			if (i == 1) {
				System.out.print("open ");
			} else {
				System.out.print("closed ");
			}
		}

	}

}
