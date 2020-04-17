package Week7;

public class Track implements Playable {
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
}
