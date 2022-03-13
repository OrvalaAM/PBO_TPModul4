import jobs.Artist;
import arts.Song;

public class DriverSong {
    public static void main(String[] args){
        Artist a1 = new Artist("Budi Doremi", "1984-09-19");
        Artist a2 = new Artist("Ed Sheeran", "1991-02-17");
        a1.displayInfo();
        a2.displayInfo();
        
        Song song1 = new Song("Melukis Senja", a1, "2020-06-29");
        Song song2 = new Song("Photograph", a2, "2015-05-10");
        song1.displayInfo();
        song2.displayInfo();
        
    }
}
