package promiennam.designpattern.singleton;

public enum MyEnum {
	
	INSTANCE;

	private String arg;

	public void writeClassName() {
		System.out.println("My class is " + getArg());
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

}
