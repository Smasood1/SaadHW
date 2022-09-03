public class movie {
    String title;
    String genre;
    int rating;

//parameterized constructer

    movie (String mName, String mGenre, int mRating){
        title = mName;
        genre = mGenre;
        rating = mRating;

    }
    void playIt(){
        System.out.println("Playing the movie" + " " + title);

        System.out.println("Genre:" + " " + genre);

        System.out.println("Rating:" + " " + rating);
    }
}
