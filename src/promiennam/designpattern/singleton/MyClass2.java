package promiennam.designpattern.singleton;

public class MyClass2 {

	private String arg;

	// make it private to prevent other initializations from outside classes
	private MyClass2() {

	}

	// inner class
	private static class Holder {
		private static final MyClass2 instance = new MyClass2();
	}

	public static MyClass2 getInstance() {
		return Holder.instance;
	}

	public void writeClassName() {
		System.out.println("My class is " + arg);
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

}
