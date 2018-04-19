package promiennam.designpattern.factorymethod;

public class CakeFactory {
	
	public static Cake getCake(String type) {
		
		if (type.equals("Pizza")) {
			return new Pizza();
		}
		
		if (type.equals("Muffin")) {
			return new Muffin();
		}
		
		if (type.equals("Custard")) {
			return new Custard();
		}
		
		return null;
	}
}
