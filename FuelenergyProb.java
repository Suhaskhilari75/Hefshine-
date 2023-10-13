package hefshineVariation;
/*
 Given an array containing positive and negative numbers. The array represents

checkpoints from one end to other end of street. Positive and negative values

represent amount of energy at that checkpoint. Positive numbers increase the

energy and negative numbers decrease. Find the minimum initial energy required

cross the street such that Energy level never becomes 0 or less than 0.
suppose  initially we have energy = 0, now at 1st


input: arr[] = {4, -10, 4, 4, 4)

outpu: 7
*/
public class FuelenergyProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,-10,4,4,4};
		int fuel=1;
		Integer min =Integer.MAX_VALUE;//any value for true condition in first
		for (int i = 0; i < a.length; i++) {
			fuel+=a[i];
			if (fuel<min) {
				min=fuel;
				
			}
			
		}
		if (min<0) {
			fuel=1-min+1;//initial 1 +minimum +1
			System.out.println("minimun fuel requirmrnt is: "+fuel);
		}
		else {
			//fuel=1;
			System.out.println("minimun fuel requirmrnt is: "+1);
		}

	}

}
