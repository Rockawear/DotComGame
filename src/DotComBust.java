import java.util.ArrayList;

/**
 * Created by rfixe on 4/9/2017.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    private void setUpGame() {
    // Object creation and stick them in the ArrayList
        DotCom dot0 = new DotCom();
        DotCom dot1 = new DotCom();
        DotCom dot2 = new DotCom();

        dot0.setNameHolder("Go2.com");
        dot1.setNameHolder("Pets.com");
        dot2.setNameHolder("AskMe.com");

        dotComList.add(dot0);
        dotComList.add(dot1);
        dotComList.add(dot2);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
    //This is the method that starts the game
    private void startPlaying() {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    //Here is the method that check on the user guesses, might need improvement
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }
    }
    //Here is the method to end the game after 18 guesses
    private void finishGame() {
        System.out.println("All Dot Coms are dead! Your stuck is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
    //This is my main method
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
