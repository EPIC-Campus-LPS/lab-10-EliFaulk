package packageName;

public class FlowerBed {
	
	private Flower[] bed;
	
	public FlowerBed(Flower[] b) {
		bed = b;
	}
	
	public FlowerBed(int num) {
		bed = new Flower[num];
	}
	
	
	public Flower[] getBed() {
		return bed;
	}
	public void setBed(Flower[] b) {
		bed = b;
	}
	
	public int plantFlower(Flower f) {
		Flower first = null;
		Flower second = null;
		Flower third = null;
		int index = 0;
		for (int i = 0; i < bed.length; i++) {
			first = second;
			second = third;
			third = bed[i];
			if ((second == null) && (third == null)) {
				bed[i] = f;
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void flipBed() {
		for (int i = bed.length; i > bed.length/2; i--) {
			Flower temp = bed[i-1];
			bed[i-1] = bed[bed.length - i];
			bed[bed.length - i] = temp;
		}
	}
	
	@Override
	public String toString() {
		String str = "FlowerBed{";
		for (Flower f : bed) {
			str = str + f + ", ";
		}
		return str + "}";
	}
}
