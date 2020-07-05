
public class Answer11 {
	
	public static void main(String[] args) {
		double[] array1 = {5.4, 7.6, 2.2, 1.8};
		double[] array2 = {3.25, 2.77, 5.7 };
	
		boolean array2Greater = avgTwoArrays(array1, array2);
		System.out.println(array2Greater);
}

	private static boolean avgTwoArrays(double[] array1, double[] array2) {
		double avg1 = average(array1);
		double avg2 = average(array2);
		
		return avg1 > avg2;
		
	}

	private static double average(double[] array) {
		double total = 0.0;
				
		for (int index = 0; index < array.length; index++) {
			total += array[index];
		}
			
		
		return total / array.length;

	}
}
