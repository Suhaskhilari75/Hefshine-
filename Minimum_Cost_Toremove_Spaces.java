package StringVariation;

public class Minimum_Cost_Toremove_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = " @    $";
		char ch[] = string.toCharArray();
		int min_cost = 0;
		int i = 0;
		while (ch[i] == ' ') {
			i++;

		}
		for (; i < ch.length; i++) {
			if (ch[i] == ' ') {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[j] != ' ') {
						char temp = ch[i];
						ch[i] = ch[j];
						ch[j] = temp;
						min_cost+=(j-i);
						break;

					}
				}
			}

		}
		System.out.println("minimum cost to remove spaces is : "+min_cost +" unit");

	}
}