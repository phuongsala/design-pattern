package phuongsala.designpattern.builder;

public class Cake {

	private Builder builder;

	public Cake(Builder builder) {
		this.builder = builder;
	}

	static class Builder {

		private String name;
		private int color;
		private float width;
		private float height;
		private String factory;
		private String producer;

		public Cake create() {
			return new Cake(this);
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setColor(int color) {
			this.color = color;
			return this;
		}

		public Builder setWidth(float width) {
			this.width = width;
			return this;
		}

		public Builder setHeight(float height) {
			this.height = height;
			return this;
		}

		public Builder setFactory(String factory) {
			this.factory = factory;
			return this;
		}

		public Builder setProducer(String producer) {
			this.producer = producer;
			return this;
		}
	}

	public String getName() {
		return builder.name;
	}

	public int getColor() {
		return builder.color;
	}

	public String getProducer() {
		return builder.producer;
	}

	public String getFactory() {
		return builder.factory;
	}

	public float getWidth() {
		return builder.width;
	}

	public float getHeight() {
		return builder.height;
	}
}
