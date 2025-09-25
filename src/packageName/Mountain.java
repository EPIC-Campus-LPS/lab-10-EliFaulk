package packageName;

public class Mountain {
	
	private String name;
	private int elevation;
	private double climbDifficulty;
	
	public Mountain(String n, int e, double d) {
		name = n;
		elevation = e;
		climbDifficulty = d;
	}
	
	public String getName() {
		return name;
	}
	public int getElevation() {
		return elevation;
	}
	public double getDifficulty() {
		return climbDifficulty;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setElevation(int e) {
		elevation = e;
	}
	public void setDifficulty(double d) {
		climbDifficulty = d;
	}
	
	@Override
	public String toString() {
		return "Mountain{" + name + ", " + elevation + ", " + climbDifficulty + "}";
	}
}
