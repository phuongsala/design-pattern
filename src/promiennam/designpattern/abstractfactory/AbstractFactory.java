package promiennam.designpattern.abstractfactory;

import promiennam.designpattern.abstractfactory.cakefactory.Cake;
import promiennam.designpattern.abstractfactory.fruitfactory.Fruit;

public abstract class AbstractFactory {

	protected abstract Cake getCake(String type);

	protected abstract Fruit getFruit(String type);

}
