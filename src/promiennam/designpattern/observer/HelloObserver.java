package promiennam.designpattern.observer;

public class HelloObserver {

	private HelloListener mHelloListener;

	public HelloObserver(HelloListener helloListener) {
		this.mHelloListener = helloListener;
	}

	public void reply(String s) {
		mHelloListener.reply(s);
	}

}
