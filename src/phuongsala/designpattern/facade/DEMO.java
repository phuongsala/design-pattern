package phuongsala.designpattern.facade;

public class DEMO {

	public static void main(String[] args) {
		CakeMaker cakeMaker = new CakeMaker();
		cakeMaker.makeMuffin();
		cakeMaker.makeCustard();
		cakeMaker.makePizza();
	}
	
}
