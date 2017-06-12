package promiennam.designpattern.singleton;

public class MyClass {

	private static String arg;

	private static volatile MyClass instance;

	private MyClass() {
		
	}

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
		// The way to use Singleton
		System.out.println("My class is " + MyClass.getInstance().getArg());
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		MyClass.arg = arg;
	}
}
