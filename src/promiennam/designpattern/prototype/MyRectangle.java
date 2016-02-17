package promiennam.designpattern.prototype;

public class MyRectangle implements MyPrototype{
	
	private int mHeight;
	private int mWidth;

	public MyRectangle(int h, int w) {
		this.mHeight = h;
		this.mWidth = w;
	}

	public double area(MyRectangle rect) {
		return rect.mHeight * rect.mWidth;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public Object clone(int num) throws CloneNotSupportedException {
		return new MyRectangle(this.mWidth * num, this.mHeight * num);
	}

}
