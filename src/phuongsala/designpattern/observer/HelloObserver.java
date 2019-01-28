package phuongsala.designpattern.observer;

public class HelloObserver {

	private HelloListener mHelloListener;

	public HelloObserver(HelloListener helloListener) {
		this.mHelloListener = helloListener;
	}

	public void sayHello(String s) {
		System.out.println("Hello, my name is " + s);
		if (mHelloListener != null) {
			mHelloListener.reply(s);
		}
	}

}
