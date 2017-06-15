package promiennam.designpattern.singleton;

public class MyClass {

	private static String arg;

	private static volatile MyClass instance;

	// make it private to prevent other initializations from outside classes
	private MyClass() {
		
	}

	// sync, double check
	public static MyClass getInstance() {
		if (instance == null) {
			synchronized (MyClass.class) {
				if (instance == null) {
					instance = new MyClass();
				}
			}
		}
		return instance;
	}

	public void writeClassName() {
		System.out.println("My class is " + arg);
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		MyClass.arg = arg;
	}
}
