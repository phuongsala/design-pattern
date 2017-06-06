package promiennam.designpattern.builder.advance;

public class Muffin extends Cake {
	
	private boolean hasPeanut;
	
	public Muffin(Builder builder){
		super(builder);
		this.hasPeanut = builder.hasPeanut;
	}
	
	public boolean hasPeanut(){
		return hasPeanut;
	}

	static class Builder extends AbstractBuilder<Builder> {

		private boolean hasPeanut;

		public Builder setHasPeanut(boolean hasPeanut) {
			this.hasPeanut = hasPeanut;
			return getThis();
		}

		@Override
		protected Builder getThis() {
			return this;
		}
	
		public Muffin create(){
			return new Muffin(this);
		}

	}
}
