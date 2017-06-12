package promiennam.designpattern.singleton;

public class MyClass2 {
	
	private String arg;
	
	private MyClass2() {
		
	}
	
	private static class Holder{
		private static final MyClass2 instance = new MyClass2();
	}

	public static MyClass2 getInstance(){
		return Holder.instance;
	}
	
	public void writeClassName() {
		System.out.println("My class is " + MyClass2.getInstance().getArg());
	}

	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}
	
}
