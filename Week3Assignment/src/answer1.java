
public class answer1 {
public static void main(String[] args) {
		
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 5;
		
	
		System.out.println(ages[0] - ages[ages.length -1]);
		
		double total = 0.0;
		
		for (int index = 0; index < ages.length; index++ ) {
			total += ages[index];
			
			
		
			
			
			
			double average = total / ages.length;
			System.out.println(average);
			
		}

	}}

