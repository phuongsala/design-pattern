package promiennam.designpattern.singleton;

public enum MyEnum {
	
	Instance;

	private String arg;

	public void writeEnumName() {
		System.out.println("My enum is " + getArg());
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

}
