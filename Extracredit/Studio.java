public class Studio {
    public static void main(String[] args) {

        String[] beyonceSongs = {"Who runs the world", "Halo", "Thick"};

        String[] poloGSongs = {"RapStar", "Block-Party", "Go stupid"};



        Artist artist1 = new Artist("Beyonce", "Universal", beyonceSongs);
        //artist1.playPlayList(artist1); // playing songs by artist 1


        Artist artist2 = new Artist("PoloG", "Interscope", poloGSongs);
        //artist2.playPlayList(artist2); //playing songs by artist2


        //artist2.printArtistInfo();
        artist2.playPlayList();



    }
}