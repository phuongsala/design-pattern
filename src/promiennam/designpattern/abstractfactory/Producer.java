package promiennam.designpattern.abstractfactory;

public class Producer {
	
	public static CakeAndFruitFactory getCakeOrFruit(String type) {
		if (type.equals("Cake")) {
			return new CakeFactory();
		}
		if (type.equals("Fruit")) {
			return new FruitFactory();
		}
		return null;
	}
}
