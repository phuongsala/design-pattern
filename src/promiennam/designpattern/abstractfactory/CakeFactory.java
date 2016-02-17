package promiennam.designpattern.abstractfactory;

public class CakeFactory extends CakeAndFruitFactory {
	@Override
	protected Fruit getFruitFactory(String type) {
		return null;
	}

	@Override
	protected Cake getCakeFactory(String type) {
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
