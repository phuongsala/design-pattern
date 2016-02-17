package promiennam.designpattern.factorymethod;

public class DEMO {
	public static void main(String[] args) {
		Cake cake = CakeFactory.getCake("Pizza Cake");
		cake.roduce();
		cake = CakeFactory.getCake("Moon Cake");
		cake.roduce();
		cake = CakeFactory.getCake("Custard Cake");
		cake.roduce();
	}
}
