package promiennam.designpattern.bridge;

public class Flying implements Movement {

	@Override
	public void move() {
		System.out.println("Move: fly");
	}

}
