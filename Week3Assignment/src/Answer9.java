
public class Answer9 {
	public static void main(String[] args) {
		int [] nums = {22, 4, 83, 5};
		int max = 100;
		boolean isGreater = arrayGreaterThan(nums, max);
		System.out.println(isGreater);
	}

	private static boolean arrayGreaterThan(int[] nums, int max) {
		int total = 0;
		
		for(int num : nums) {
			total += num;
		}
		
		
		return total > max;
		
	}
}
