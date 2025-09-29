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
		for (int i = 0; i < wantToClimb.length - 1; i++) {
			for (int j = 0; j < wantToClimb.length - 1 - i; j++) {
				if (wantToClimb[j].getDifficulty() > wantToClimb[j+1].getDifficulty()) {
					Mountain temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j+1];
					wantToClimb[j+1] = temp;
				}
			}
		}
	}
	
	public void sortClimbHighToLow() {
		for (int i = 0; i < wantToClimb.length - 1; i++) {
			for (int j = 0; j < wantToClimb.length - 1 - i; j++) {
				if (wantToClimb[j].getDifficulty() < wantToClimb[j+1].getDifficulty()) {
					Mountain temp = wantToClimb[j];
					wantToClimb[j] = wantToClimb[j+1];
					wantToClimb[j+1] = temp;
				}
			}
		}
	}
	
	public MountainClimber getFourteeners() {
		this.sortClimbHighToLow();
		int stopper = wantToClimb.length;
		for (int i = 0; i < wantToClimb.length; i++) {
			if (wantToClimb[i].getElevation() < 14000) {
				stopper = i;
				break;
			}
		}
		Mountain[] fourteeners = new Mountain[stopper];
		for (int j = 0; j < stopper; j++) {
			fourteeners[j] = wantToClimb[j];
		}
		return new MountainClimber(fourteeners);
	}
	
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < wantToClimb.length; i++) {
			output = output + wantToClimb[i];
			if (i != wantToClimb.length-1) {
				output = output + ", ";
			}
		}
		return "MountainClimber{" + output + "}";
	}
}
