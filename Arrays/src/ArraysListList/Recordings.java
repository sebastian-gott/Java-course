package ArraysListList;

public class Recordings {
    private String title;
    private String artist;
    private double time;

    public Recordings(String title, String artist, double time) {
        this.title = title;
        this.artist = artist;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
