public class Main {

    public static void main(String[] args) {
        // Pokemon p1 = new Pokemon();
        // System.out.println(p1.level);

        //creating an object passing in the arguments from constructor

        Pokemon p1 = new Pokemon("Pikachu",25);
        System.out.println(p1.level);
        p1.attack();
    }
}