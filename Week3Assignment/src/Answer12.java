
public class Answer12 {
	public static void main(String[] args) {
		boolean isHotOutside = true;
		double moneyInPocket = 13.37;
				
		boolean buyDrink = willBuyDrink (isHotOutside, moneyInPocket);
		System.out.println(buyDrink);

	}

	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		return isHotOutside && moneyInPocket > 10.50;
	}
}
