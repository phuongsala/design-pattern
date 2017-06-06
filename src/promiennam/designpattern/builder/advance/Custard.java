package promiennam.designpattern.builder.advance;

public class Custard extends Cake {
	
	private boolean hasEgg;
	
	public Custard(Builder builder){
		super(builder);
		this.hasEgg = builder.hasEgg;
	}
	
	public boolean hasEgg() {
		return hasEgg;
	}

	static class Builder extends AbstractBuilder<Builder> {
		
		private boolean hasEgg;
		
		public Builder setHasEgg(boolean hasEgg){
			this.hasEgg = hasEgg;
			return getThis();
		}

		@Override
		protected Builder getThis() {
			return this;
		}
		
		public Custard create(){
			return new Custard(this);
		}
		
	}

}
