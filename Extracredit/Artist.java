public class Artist {

    //instance variables, properties, fields, attributes
    public String artistName;
    public String label;
    public String[] songs;

    //constructor a template  for making artist objects in main
    public Artist(String artistName, String label, String[] songs){
        this.artistName = artistName;
        this.label = label;
        this.songs = songs;
    }

    public void printArtistInfo(){
        System.out.println(this.artistName + " \n" +  this.label);
    }

    //Incomplete and WRONG implementation - attempt to make this method work properly
    public void playPlayList(){
        for(int x = 0; x < songs.length; x++){
            System.out.println(songs[x]);
        }

        //  for(int x = 0; x < songs.length; x++ )
        //  {System.out.println(songs[x]);
        //  }
    }


}