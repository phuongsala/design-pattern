package promiennam.designpattern.abstractfactory.cakefactory;

public class Pizza extends Cake {

	@Override
	public void make() {
		System.out.println("A Pizza is made");
	}
}
