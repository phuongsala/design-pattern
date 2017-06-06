package promiennam.designpattern.builder.advance;

public class Cake {

	private String name;
	private float width;
	private float height;

	public Cake(AbstractBuilder builder) {
		this.name = builder.name;
		this.width = builder.width;
		this.height = builder.height;
	}

	static abstract class AbstractBuilder<T extends AbstractBuilder<T>> {

		private String name;
		private float width;
		private float height;

		public T setName(String name) {
			this.name = name;
			return getThis();
		}

		public T setWidth(float width) {
			this.width = width;
			return getThis();
		}

		public T setHeight(float height) {
			this.height = height;
			return getThis();
		}

		protected abstract T getThis();
	}
}
