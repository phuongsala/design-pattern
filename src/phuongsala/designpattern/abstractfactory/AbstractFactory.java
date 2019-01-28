package phuongsala.designpattern.abstractfactory;

import phuongsala.designpattern.abstractfactory.cakefactory.Cake;
import phuongsala.designpattern.abstractfactory.fruitfactory.Fruit;

public abstract class AbstractFactory {

	protected abstract Cake getCake(String type);

	protected abstract Fruit getFruit(String type);

}
