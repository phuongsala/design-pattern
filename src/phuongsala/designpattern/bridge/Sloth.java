package phuongsala.designpattern.bridge;

public class Sloth extends Animal {

	protected Sloth(Movement movement) {
		super(movement);
	}

	@Override
	protected void move() {
		movement.move();		
	}

}
