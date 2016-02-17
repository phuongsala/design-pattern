package promiennam.designpattern.singleton;

public class MyClass {

	/**
	 * Singleton without pass parameter
	 */
	// private static MyClass Inst;
	//
	// public static MyClass getInst() {
	// return Inst == null ? new MyClass() : Inst;
	// }
	//
	/**
	 * Singleton with pass parameter
	 */
	private static String  mArg;
	private static MyClass mInst;

	public static MyClass getInst() {
		return mInst == null ? new MyClass(mArg) : mInst;
	}

	// Set private to prevent modifiers from out class accesses.
	private MyClass(String arg) {
		this.setArg(arg);
	}
	
	public MyClass(){
		
	}
	
	public void writeClassName(){
		// The way to use Singleton
		System.out.println("My class is " + MyClass.getInst().getArg());
	}

	public String getArg() {
		return mArg;
	}

	public void setArg(String arg) {
		MyClass.mArg = arg;
	}
}
