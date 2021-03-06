package Week7;

import java.util.ArrayList;

public class CompactDisc extends Discs {
  private ArrayList<Track> tracks = new ArrayList<>();
  private String artist;

	public CompactDisc() {
	}

	public void getDetail() {
		super.getDetail();
		System.out.println("Artist: " + getArtist());
		System.out.println("Track:");
		int num = 1;
		for(Track track : getTracks()) {
			System.out.println("Track " + (num++) + " title: " + track.getTitle() + " length: " + track.getLength());
		}
	}

	public void play() {

	}

  public ArrayList<Track> getTracks() {
    return tracks;
  }

  public void setTracks(ArrayList<Track> tracks) {
    this.tracks = tracks;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void addTrack(Track track) {
    if (tracks.contains(track)) {
      tracks.add(track);
    }
  }

  public void removeTrack(Track track) {
    tracks.remove(track);
  }

  public int getLength() {
	  int total = 0;
	  for(Track track : tracks) {
	    total += track.getLength();
    }
	  return total;
  }
}
