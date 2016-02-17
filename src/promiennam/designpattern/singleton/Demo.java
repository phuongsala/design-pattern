package promiennam.designpattern.singleton;

public class Demo {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.setArg("ABC");
		MyClass.getInst().writeClassName();
	}
}
