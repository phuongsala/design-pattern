package phuongsala.designpattern.prototype;

public interface MyPrototype extends Cloneable {
	Object clone() throws CloneNotSupportedException;
	Object clone(int num) throws CloneNotSupportedException;
}
