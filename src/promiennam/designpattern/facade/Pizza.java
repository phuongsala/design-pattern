package promiennam.designpattern.facade;

public class Pizza extends Cake {

	@Override
	protected void make() {
		System.out.println("Make Pizza");
	}

}
