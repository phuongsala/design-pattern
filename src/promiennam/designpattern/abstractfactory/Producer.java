package promiennam.designpattern.abstractfactory;

import promiennam.designpattern.abstractfactory.cakefactory.CakeFactory;
import promiennam.designpattern.abstractfactory.fruitfactory.FruitFactory;

public class Producer {
	
	public static AbstractFactory getFactory(String type) {
		if (type.equals("Cake")) {
			return new CakeFactory();
		}
		if (type.equals("Fruit")) {
			return new FruitFactory();
		}
		return null;
	}
}
