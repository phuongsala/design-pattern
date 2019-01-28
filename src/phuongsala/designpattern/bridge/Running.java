package phuongsala.designpattern.bridge;

public class Running implements Movement {

	@Override
	public void move() {
		System.out.println("Move: run");
	}

}
