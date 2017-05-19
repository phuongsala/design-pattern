package promiennam.designpattern.builder;

import promiennam.designpattern.builder.Cake.Builder;

public class DEMO {

	public static void main(String[] args) {
		Cake.Builder builder = new Builder();
		
		Cake cake = builder.setColor(0)
				.setName("Muffin")
				.setProducer("Nestle")
				.create();
		System.out.println("Cake's name is " + cake.getBuilder().getName());
		System.out.println("Cake's producer is " + cake.getBuilder().getProducer());

		Cake cake2 = builder.setColor(0)
				.setHeight(10)
				.setWidth(20)
				.create();
		System.out.println("Cake 2 width = " + cake2.getBuilder().getWidth());
		System.out.println("Cake 2 height = " + cake2.getBuilder().getHeight());
	}
}
