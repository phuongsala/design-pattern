package promiennam.designpattern.abstractfactory;

import promiennam.designpattern.abstractfactory.cakefactory.Cake;
import promiennam.designpattern.abstractfactory.fruitfactory.Fruit;

public abstract class AbstractFactory {

	protected abstract Cake getCakeFactory(String type);

	protected abstract Fruit getFruitFactory(String type);

}
