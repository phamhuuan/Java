package Week8;

public class Track implements Playable, Comparable {
	private String title;
	private int length;

	public Track() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void play() {
		System.out.println("Track " + this.getTitle());
		System.out.println("Length " + this.getLength());
	}

	@Override
	public int compareTo(Object object) {
		int returnNumber = this.getTitle().compareTo(((Track)object).getTitle());
		return returnNumber != 0 ? returnNumber : Integer.compare(this.getLength(), ((Track)object).getLength());
	}
}
