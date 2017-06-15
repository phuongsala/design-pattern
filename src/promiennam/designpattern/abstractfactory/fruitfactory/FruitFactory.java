package promiennam.designpattern.abstractfactory.fruitfactory;

import promiennam.designpattern.abstractfactory.AbstractFactory;
import promiennam.designpattern.abstractfactory.cakefactory.Cake;

public class FruitFactory extends AbstractFactory {
	
	@Override
	protected Fruit getFruitFactory(String type) {
		if (type.equals("Apple")) {
			return new Orange();
		}
		if (type.equals("Pear")) {
			return new Pear();
		}
		if (type.equals("Lychee")) {
			return new Lychee();
		}
		return null;
	}

	@Override
	protected Cake getCakeFactory(String type) {
		return null;
	}
}
