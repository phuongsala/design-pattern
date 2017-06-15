package promiennam.designpattern.abstractfactory;

import promiennam.designpattern.abstractfactory.cakefactory.Cake;
import promiennam.designpattern.abstractfactory.fruitfactory.Fruit;

public class DEMO {
	
	public static void main(String[] args) {
		
		AbstractFactory cakeFactory = Producer.getFactory("Cake");
		Cake cake = cakeFactory.getCakeFactory("Pizza");
		cake.make();
		
		AbstractFactory fruitFactory = Producer.getFactory("Fruit");
		Fruit fruit = fruitFactory.getFruitFactory("Apple");
		fruit.wash();

	}
}
