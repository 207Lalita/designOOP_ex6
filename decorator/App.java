
public class App {
	public static void main(String[] args) {
		Beverage plainBeverage = new PlainBeverage();
		Beverage milkBeverage = new Milk(plainBeverage);
		Beverage sugarBeverage = new Sugar(milkBeverage);
		Beverage sugarAndMilkBeverage = new Sugar(sugarBeverage);

		System.out.println("Your order " + sugarAndMilkBeverage.getDescription());
		System.out.println("The cost is " + sugarAndMilkBeverage.getCost());
	}
}
