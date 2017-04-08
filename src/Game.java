import java.util.Scanner;

/**
 * Created by rfixe on 4/7/2017.
 */
public class Game {
    public static void main(String [] args){
        int numOfGuesses = 0;
        DotCom dot = new DotCom();
        Scanner userInput = new Scanner(System.in);

        int random = 0;
        int [] ramdomlyGenerated = {3, 4, 5};

        dot.setLocationCells(ramdomlyGenerated);

        boolean isAlive = true;

        while (isAlive){
            System.out.println("Enter a number: ");
            String n = userInput.nextLine();
            if (n == )

        }
    }
}
