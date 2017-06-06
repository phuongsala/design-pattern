package promiennam.designpattern.facade;

public class CakeMaker {

	private Cake muffin;
	private Cake custard;
	private Cake pizza;

	public CakeMaker() {
		muffin = new Muffin();
		custard = new Custard();
		pizza = new Pizza();
	}
	
	public void makeMuffin(){
		muffin.make();
	}
	
	public void makeCustard(){
		custard.make();
	}
	
	public void makePizza(){
		pizza.make();
	}
	
	

}
