package Week7;

public class DigitalVideoDisc extends Discs implements Playable {
	public DigitalVideoDisc() {
	}

  @Override
  public void play() {
    System.out.println("Playing DVD " + this.getTitle());
    System.out.println("DVD length " + this.getLength());
  }
}