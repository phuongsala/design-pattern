package phuongsala.designpattern.prototype;

public class DEMO {
	public static void main(String[] args) throws CloneNotSupportedException {

		MyRectangle rect1 = new MyRectangle(10, 20);
		System.out.println("Area of Rectangle 1 is " + rect1.area(rect1));
		
		MyRectangle rect2 = (MyRectangle) rect1.clone();
		System.out.println("Area of Rectangle 2 is " + rect2.area(rect2));
		
		MyRectangle rect3 = (MyRectangle) rect1.clone(3);
		System.out.println("Area of Rectangle 3 is " + rect3.area(rect3));
		
		
	}
}
