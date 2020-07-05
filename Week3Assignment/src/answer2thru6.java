
public class answer2thru6 {
public static void main(String[] args) {
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int[] nameLengths = new int[names.length];
		
		for (int index = 0; index < names.length; index++ ) {
		String name = names[index];
		nameLengths[index] = name.length();
		System.out.print(name + ", " + " ");
		}
		
		double totalLength = 0;
		
		for (int index = 0; index < nameLengths.length; index++) {
			totalLength += nameLengths[index];
		}
		
		double average = totalLength / nameLengths.length;
		
		System.out.println("Element Sum:" + " " + totalLength + " " + "Average length: " + average);
		
		for (int index = 0; index < nameLengths.length; index++) {
			
		}
		
	}
}
