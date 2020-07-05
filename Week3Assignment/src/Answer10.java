
public class Answer10 {
	public static void main(String[] args) {
		double[] array = {5.4, 7.6, 2.2, 1.8};
		double avg = average(array);
		System.out.println(avg);

}

	private static double average(double[] array) {
		double total = 0.0;
				
		for (int index = 0; index < array.length; index++) {
			total += array[index];
		}
			
		
		return total / array.length;
	}
}
