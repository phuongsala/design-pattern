package promiennam.designpattern.builder.advance;

public class DEMO {
	
	public static void main(String[] args){
		
		Muffin muffin = new Muffin.Builder()
				.setName("Muffin")
				.setHasPeanut(true)
				.setWidth(10)
				.setHeight(3)
				.create();
		System.out.println("Muffin has Peanut " + muffin.hasPeanut());
		
		Custard custard = new Custard.Builder()
				.setName("Custard")
				.setHasEgg(true)
				.setWidth(20)
				.setHeight(5)
				.create();
		System.out.println("Custard has Egg " + custard.hasEgg());
		
		Pizza pizza = new Pizza.Builder()
				.setName("Pizza")
				.setHasPepper(true)
				.setWidth(100)
				.setHeight(10)
				.create();
		System.out.println("Pizza has Pepper " + pizza.hasPepper());
	}

}
