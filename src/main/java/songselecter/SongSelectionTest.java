package songselecter;

public class SongSelectionTest {
    public static void main(String[] args) {
    SongSelection song1 = new SongSelection("No Guidence","Chris Brown");
        System.out.println(song1);
        System.out.println("Now Playing");
        song1.setTitle();
        System.out.println("BY");
        song1.play();
        System.out.println("Favorite Track");
        song1.favoriteTrack();

    }
}
