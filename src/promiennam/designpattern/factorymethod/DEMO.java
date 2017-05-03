package promiennam.designpattern.factorymethod;

public class DEMO {
	public static void main(String[] args) {
		Cake cake = CakeFactory.getCake("Pizza Cake");
		cake.produce();
		cake = CakeFactory.getCake("Moon Cake");
		cake.produce();
		cake = CakeFactory.getCake("Custard Cake");
		cake.produce();
	}
}
