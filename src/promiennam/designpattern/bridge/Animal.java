package promiennam.designpattern.bridge;

public abstract class Animal {
	
	protected Movement movement;
	
	protected Animal(Movement movement){
		this.movement = movement;
	}
	
	protected abstract void move();
	
}
