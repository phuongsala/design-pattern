package promiennam.designpattern.bridge;

public class DEMO {

	public static void main(String[] args) {
		
		Animal dog = new Dog(new Running());
		dog.move();
		
		Animal eagle = new Dog(new Flying());
		eagle.move();
		
		Animal sloth = new Sloth(new Crawling());
		sloth.move();
	}

}
