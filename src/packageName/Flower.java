package packageName;

public class Flower {
	
	private String species;
	
	public Flower(String s) {
		species = s;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String s) {
		species = s;
	}
	
	@Override
	public String toString() {
		return "Flower{" + species + "}";
	}
}
