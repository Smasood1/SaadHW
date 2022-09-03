public class Pokemon {

    String name;
    int level;

    //constructers

    Pokemon(){
        level = 1;
    }

    //parameterized constructer

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;

    }

    void attack(){

        System.out.print(name + " attack!");

    }
}