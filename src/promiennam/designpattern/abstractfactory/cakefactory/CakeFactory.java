package promiennam.designpattern.abstractfactory.cakefactory;

import promiennam.designpattern.abstractfactory.AbstractFactory;
import promiennam.designpattern.abstractfactory.fruitfactory.Fruit;

public class CakeFactory extends AbstractFactory {
	
	@Override
	protected Fruit getFruitFactory(String type) {
		return null;
	}

	@Override
	protected Cake getCakeFactory(String type) {
		if (type.equals("Pizza")) {
			return new Pizza();
		}
		if (type.equals("Muffin")) {
			return new Muffin();
		}
		if (type.equals("Custard")) {
			return new Custard();
		}
		return null;
	}
}
