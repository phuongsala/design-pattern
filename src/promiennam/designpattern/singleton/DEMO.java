package promiennam.designpattern.singleton;

public class DEMO {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.setArg("ABC");
		MyClass.getInst().writeClassName();
	}
}
