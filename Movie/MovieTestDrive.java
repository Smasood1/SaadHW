public class MoveTestDrive {

    public static void main(String[] args) {

        //creating objects

        movie one = new movie("Gone with the Stock", "Tragic", -2);
        // one.title = "Gone with the Stock";
        //one.genre = "Tragic";
        //one.rating = -2;

        movie two = new movie("Lost in Cubicle of Space", "Comedy", 5);
        //two.title = "Lost in Cubicle Space";
        //two.genre = "Comedy";
        //two.rating = 5;

        movie three = new movie("Bute Club", "Tragic but ultimately uplifting", 127);
        //three.title = "Bute Club";
        //three.genre = "Tragic but ultimately uplifting";
        //three.rating = 127;

        three.playIt();

    }
}