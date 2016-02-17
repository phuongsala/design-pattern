package promiennam.designpattern.abstractfactory;

public abstract class CakeAndFruitFactory {

	protected abstract Cake getCakeFactory(String type);

	protected abstract Fruit getFruitFactory(String type);

}
