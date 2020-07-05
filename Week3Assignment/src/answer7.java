
public class answer7 {
	public static void main(String[] args) {
		String words = concatenateWords("Hello ", 3);
				System.out.println(words);

	}

	public static String concatenateWords(String word, int numberOfTimes) {
		String words = "";
		
		while(numberOfTimes > 0) {
			words += word;
			
			numberOfTimes -= 1;
		}
		
		return words;
	}
}
