package songselecter;
//Song class with the following instance variables and methods
//instance variable/property : title;
//instance variable/property : artist;
//method1: setTitle;
//method2: play;
//method3: favoriteTrack
//- the favoriteTrack Methods takes in an array of song  titles and returns the second to the last track in the array.

public class SongSelection {
    private String title;
    private String artist;

    public SongSelection(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public void  setTitle(){
        System.out.println(title);
    }
    public void play(){
        System.out.println(artist);
    }
    public void favoriteTrack(){ String[] TrackTitles = {"Talk-Kahlid","I Don't Care - Justin Bieber","Old Town Road - Lil Nas X","Bad Guy - Billie Eilish"};
        System.out.println(TrackTitles[2]);

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SongSelection{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}

