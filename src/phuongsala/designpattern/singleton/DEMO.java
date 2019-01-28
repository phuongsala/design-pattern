package phuongsala.designpattern.singleton;

public class DEMO {
	public static void main(String[] args) {
		// Case 1
		MyClass.getInstance().setArg("Hello 1");
		MyClass.getInstance().writeClassName();
		// Case 2
		MyClass2.getInstance().setArg("Hello 2");
		MyClass2.getInstance().writeClassName();
		// Case 3
		MyEnum.Instance.setArg("Hello 3");
		MyEnum.Instance.writeEnumName();
	}
}
