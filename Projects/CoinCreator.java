/*

This is a class which will allow us to instantiate objects: i.e. create coins

*/

public class CoinCreator {

    private int face; // a variable that represents the current face: 0 for heads and 1 for tails

    public CoinCreator(int inputFace) {

        /* Constructor: you want to set the parameter (user input) to your instance variable */

        /* Code goes here */

    }

    public int getCoinFace() {

        /*Since the variable face is private instead of public, you need to have a public method
        that will allow you to call for the date in the private instance variable. Returns the current value. */

        return face;

    }

    public void flip() {

        /* Use the Math.random and the Math.round feature to flip the coin here */
        
        /* Code goes here */

    }

}
