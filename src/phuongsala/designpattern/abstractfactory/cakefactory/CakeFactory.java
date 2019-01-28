package phuongsala.designpattern.abstractfactory.cakefactory;

import phuongsala.designpattern.abstractfactory.AbstractFactory;
import phuongsala.designpattern.abstractfactory.fruitfactory.Fruit;

public class CakeFactory extends AbstractFactory {
	
	@Override
	protected Fruit getFruit(String type) {
		return null;
	}

	@Override
	protected Cake getCake(String type) {
		
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
