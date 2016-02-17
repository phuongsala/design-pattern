package promiennam.designpattern.factorymethod;

public class CakeFactory {
	public static Cake getCake(String type) {
		if (type.equals("Pizza Cake")) {
			return new PizzaCake();
		}
		if (type.equals("Moon Cake")) {
			return new MoonCake();
		}
		if (type.equals("Custard Cake")) {
			return new CustardCake();
		}
		return null;
	}
}
