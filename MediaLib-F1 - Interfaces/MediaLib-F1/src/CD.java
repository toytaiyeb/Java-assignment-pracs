public class CD implements Media{
    private String title;
    private String artist;
    private int no_of_tracks;
    private double price;

    public CD(String title, String artist, int no_of_tracks, double price) {
        this.title = title;
        this.artist = artist;
        this.no_of_tracks = no_of_tracks;
        this.price = price;
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

    public int getNo_of_tracks() {
        return no_of_tracks;
    }

    public void setNo_of_tracks(int no_of_tracks) {
        this.no_of_tracks = no_of_tracks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", no_of_tracks=" + no_of_tracks +
                ", price=" + price +
                '}';
    }

    @Override
    public void play() {
        System.out.println("\n  Playing CD " + title);
    }
}
