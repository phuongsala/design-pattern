package phuongsala.designpattern.abstractfactory;

import phuongsala.designpattern.abstractfactory.cakefactory.CakeFactory;
import phuongsala.designpattern.abstractfactory.fruitfactory.FruitFactory;

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
