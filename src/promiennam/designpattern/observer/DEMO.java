package promiennam.designpattern.observer;

public class DEMO{

	
	public static void main(String[] args) {
		
		String name = "Phuong";
		
		HelloObserver hello = new HelloObserver(new HelloListener() {
			
			@Override
			public void reply(String s) {
				System.out.println("Hello " + s + ", nice to meet you!");
			}
		});
		
		hello.sayHello(name);
	}

}
