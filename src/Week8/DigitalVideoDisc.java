package Week8;

public class DigitalVideoDisc extends Discs implements Playable, Comparable {
	public DigitalVideoDisc() {
	}

	public void getDetail(){
		super.getDetail();
	}

  public void play() {

  }

	@Override
	public int compareTo(Object object) {
		int returnNumber = this.getTitle().compareTo(((DigitalVideoDisc)object).getTitle());
		return returnNumber != 0 ? returnNumber : Integer.compare(this.getLength(), ((DigitalVideoDisc)object).getLength());
	}
}