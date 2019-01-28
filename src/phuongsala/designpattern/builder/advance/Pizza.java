package phuongsala.designpattern.builder.advance;

public class Pizza extends Cake{
	
	private boolean hasPepper;
	
	public Pizza(Builder builder){
		super(builder);
		this.hasPepper = builder.hasPepper;
	}
	
	public boolean hasPepper(){
		return hasPepper;
	}

	static class Builder extends AbstractBuilder<Builder> {

		private boolean hasPepper;

		public Builder setHasPepper(boolean hasPepper) {
			this.hasPepper = hasPepper;
			return getThis();
		}

		@Override
		protected Builder getThis() {
			return this;
		}
		
		public Pizza create(){
			return new Pizza(this);
		}

	}
}
