package Week8;

public class Discs extends Media {
	private String director;
	private int length;

	public Discs() {
	}

	public void getDetail() {
		super.getDetail();
		System.out.println("Directory: " + getDirector());
		System.out.println("Length: " + getLength());
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
