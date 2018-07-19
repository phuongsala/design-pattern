package promiennam.designpattern.builder;

import promiennam.designpattern.builder.Cake.Builder;

public class DEMO {

	public static void main(String[] args) {
		Cake.Builder builder = new Builder();
		
		Cake cake = builder.setColor(0)
				.setName("Muffin")
				.setProducer("Nestle")
				.create();
		System.out.println("Cake's name is " + cake.getName());
		System.out.println("Cake's producer is " + cake.getProducer());

		Cake cake2 = builder.setColor(0)
				.setHeight(10)
				.setWidth(20)
				.create();
		System.out.println("Cake 2 width = " + cake2.getWidth());
		System.out.println("Cake 2 height = " + cake2.getHeight());
	}
}
