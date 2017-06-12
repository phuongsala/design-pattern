package promiennam.designpattern.singleton;

public class DEMO {
	public static void main(String[] args) {
		MyClass.getInstance().setArg("Hello");
		MyClass.getInstance().writeClassName();
	}
}
