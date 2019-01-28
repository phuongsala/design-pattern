package phuongsala.designpattern.abstractfactory;

import phuongsala.designpattern.abstractfactory.cakefactory.Cake;
import phuongsala.designpattern.abstractfactory.fruitfactory.Fruit;

public class DEMO {
	
	public static void main(String[] args) {
		
		AbstractFactory cakeFactory = Producer.getFactory("Cake");
		Cake cake = cakeFactory.getCake("Pizza");
		cake.make();
		
		AbstractFactory fruitFactory = Producer.getFactory("Fruit");
		Fruit fruit = fruitFactory.getFruit("Apple");
		fruit.wash();

	}
}
