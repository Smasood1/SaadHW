public class Phraseomatic {
    public static void main(String[] args) {
        String [] wordListOne = {"Gold Standard","Standard","Tiny","Fabulous","Fantastic","Massive","Dumb","Smart","Classy", "well dressed","Established","funny"};
        String [] wordListTwo = {"lazy","Powerful","Generous","Strong","Speedy","Smelly","Sticky","Black","Loud","Ugly","Handsome","Nosey"};
        String [] wordListThree = {"Foot","Toe","Liver","Genius","Hexagonal Nut","Elbow","Wrench","Hammer","Toucan","Elephant Trunk","Goose Neck","blobfish"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[random1] + " " + wordListThree[random2] + " " + wordListThree[random3];

        System.out.println("What we need is a" + " " + phrase);

    }
}