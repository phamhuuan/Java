package Week8;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Discs implements Comparable {
  private List<Track> tracks = new ArrayList<>();
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

  public List<Track> getTracks() {
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

	@Override
	public int compareTo(Object object) {
		int returnNumber = this.getTitle().compareTo(((CompactDisc)object).getTitle());
		return returnNumber != 0 ? returnNumber : Integer.compare(this.getLength(), ((CompactDisc)object).getLength());
	}
}
