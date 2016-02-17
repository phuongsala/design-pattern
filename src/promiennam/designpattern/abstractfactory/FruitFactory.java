package promiennam.designpattern.abstractfactory;

public class FruitFactory extends CakeAndFruitFactory {
	@Override
	protected Fruit getFruitFactory(String type) {
		if (type.equals("Apple")) {
			return new Apple();
		}
		if (type.equals("Dragon Fruit")) {
			return new DragonFruit();
		}
		if (type.equals("Watermelon")) {
			return new Watermelon();
		}
		return null;
	}

	@Override
	protected Cake getCakeFactory(String type) {
		return null;
	}
}
