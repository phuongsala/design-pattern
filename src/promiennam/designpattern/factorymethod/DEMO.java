package promiennam.designpattern.factorymethod;

public class DEMO {
	
	public static void main(String[] args) {
		Cake cake = CakeFactory.getCake("Pizza");
		cake.produce();
		cake = CakeFactory.getCake("Muffin");
		cake.produce();
		cake = CakeFactory.getCake("Custard");
		cake.produce();
	}
	
}
