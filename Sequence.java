package hefshineVariation;



//1,1,2,1,2.34
public class Sequence {
//consider a infinite sequence of int 1,1,2,1,2,3,1,2,3,4,1,2,3,4,5.....
	//1st from 1 then 1 ro 2 ;then 1 to 3 ...so on;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int num=3;//output3
		outer: for (int i = 1; ; i++) {
			for (int j = 0;j<num ; j++) {
				counter++;
				
				if (counter==num) {
					System.out.println(j);
					break outer;
				}
				
			}
		}

	}

}
