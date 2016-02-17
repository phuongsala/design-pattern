package promiennam.designpattern.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		
		CakeAndFruitFactory cakeFactory = Producer.getCakeOrFruit("Cake");
		Cake cake = cakeFactory.getCakeFactory("Pizza Cake");
		cake.roduce();
		
		CakeAndFruitFactory fruitFactory = Producer.getCakeOrFruit("Fruit");
		Fruit fruit = fruitFactory.getFruitFactory("Apple");
		fruit.collect();

	}
}
