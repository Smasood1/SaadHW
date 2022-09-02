/*public class Beersong {
    public static void main(String[] args) {
        int beerNum = 10;
        String word = "bottles";


        while (beerNum > 0)
        {
            if (beerNum == 1)
            {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            //added space in between necessary texts
            System.out.println(beerNum + " " + word + " of beer.");
            //added space in between necesssary texts
            System.out.println("take one down.");
            System.out.println("pass it around.");
            beerNum = beerNum -1;

            //The problem is it says "1 bottles of beer", when it should be saying "1 bottle of beer"
            //First ill see what happens if I move the if statement below line 18
            //that didnt work


            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }   else {
                System.out.println("No more bottles of beer on the wall");
            }

        }
    }
}
*/


//im going to try to create the song from scratch and see if i can make it work

public class Beersong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        for (int num = 99; num >= 0; num--) {
            if (num > 1) {
                System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (num - 1) + " bottles of beer on the wall.");
            } else if (num == 1) {
                System.out.println(num + " bottle of beer on the wall, " + num + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + (num - 1) + " bottle of beer on the wall.");
            } else if (num == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            }
        }
    }
}
