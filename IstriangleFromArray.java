package hefshineVariation;
/*Count the number of possible triangles from a given unsorted array of positive IntegersNote: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.

Input:Array: [6, 7, 9, 16, 25, 12, 30, 40] Total number of triangles: 17
*/
public class IstriangleFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z[] = { 6, 7, 9, 16, 25, 12, 30, 40 };

		int count = 0;
		for (int i = 0; i < z.length; i++) {
			for (int j = i + 1; j < z.length; j++) {
				for (int k = j + 1; k < z.length; k++) {
					boolean Istriangle = istriangle(z[i], z[j], z[k]);
					if (Istriangle) {
						count++;
						System.out.println(z[i] + " " + z[j] + " " + z[k]);
					}

				}
			}
		}
		System.out.println(count);
	}

	private static boolean istriangle(int i, int j, int k) {
		// TODO Auto-generated method stub
		if (i + j > k && j + k > i && i + k > j) {
			return true;
		}
		else {
			return false;

		}
	}

}
