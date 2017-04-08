import java.util.Scanner;

/**
 * Created by rfixe on 4/7/2017.
 */
public class Game {
    public static void main(String [] args){
        int numOfGuesses = 0;
        DotCom dot = new DotCom();
        Scanner userInput = new Scanner(System.in);

        int randomlyGenerated = (int) Math.random() * 5;
        int [] locations = {randomlyGenerated, randomlyGenerated+1, randomlyGenerated+2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive){
            System.out.println("Enter a number: ");
            String n = userInput.nextLine();
            String result = dot.checkYourself(n);
            numOfGuesses++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }
    }
}
