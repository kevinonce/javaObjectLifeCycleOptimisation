package pattern.object.lifecycle.builder;

public class GrilleNutritionnelle {
	
	private final float taillePortion;
	private final float kcalories;
	private final float graisses;
	private final float glucides;
	private final float proteines;
	private final float sel;

	public static class Builder {
		//parametres obligatoires
		private final float taillePortion;
		private final float kcalories;
		// parametres optionels
		private float graisses = Float.valueOf(0);
		private float glucides = Float.valueOf(0);
		private float proteines = Float.valueOf(0);
		private float sel = Float.valueOf(0);

		public Builder(float taillePortion, float kcal) {
			this.taillePortion = taillePortion;
			this.kcalories = kcal;
		}

		public Builder graisses(float val) {
			graisses = val;
			return this;
		}

		public Builder glucides(float val) {
			glucides = val;
			return this;
		}

		public Builder proteines(float val) {
			proteines = val;
			return this;
		}

		public Builder sel(float val) {
			sel = val;
			return this;
		}

		public GrilleNutritionnelle build() {
			return new GrilleNutritionnelle(this);
		}
	}

	private GrilleNutritionnelle(Builder builder) {
		taillePortion = builder.taillePortion;
		kcalories = builder.kcalories;
		graisses = builder.graisses;
		sel = builder.sel;
		glucides = builder.glucides;
		proteines = builder.proteines;
	}

	public float getTaillePortion() {
		return taillePortion;
	}

	public float getKcalories() {
		return kcalories;
	}

	public float getGraisses() {
		return graisses;
	}

	public float getGlucides() {
		return glucides;
	}

	public float getProteines() {
		return proteines;
	}

	public float getSel() {
		return sel;
	}
}
