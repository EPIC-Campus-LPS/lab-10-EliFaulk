package packageName;

public class MountainClimber {

	private Mountain[] wantToClimb;
	
	public MountainClimber(Mountain[] want) {
		wantToClimb = want;
	}
	
	public Mountain[] getWantToClimb() {
		return wantToClimb;
	}
	public void setWantToClimb(Mountain[] w) {
		wantToClimb = w;
	}
	
	public Mountain mostDifficultClimb() {
		Mountain difficult = wantToClimb[0];
		for (Mountain mount : wantToClimb) {
			if (mount.getDifficulty() > difficult.getDifficulty()) {
				difficult = mount;
			}
		}
		return difficult;
	}
	
	public void sortClimbLowToHigh() {
		
	}
}
