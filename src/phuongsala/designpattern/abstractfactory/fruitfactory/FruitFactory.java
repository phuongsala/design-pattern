package phuongsala.designpattern.abstractfactory.fruitfactory;

import phuongsala.designpattern.abstractfactory.AbstractFactory;
import phuongsala.designpattern.abstractfactory.cakefactory.Cake;

public class FruitFactory extends AbstractFactory {
	
	@Override
	protected Fruit getFruit(String type) {
		
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
	protected Cake getCake(String type) {
		return null;
	}
}
