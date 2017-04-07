/**
 * Created by rfixe on 4/7/2017.
 */
public class DotCom {
    int[] locationCells;
    int numOfHits = 0;

    String checkYourself(String guess) {
        if (guess == "1") {
            return "miss";
        } else if (guess == "2") {
            return "hit";
        } else {
            return "kill";
        }
    }

    void setLocationCells(int[] locationCells) {

        this.locationCells = locationCells;
    }
}
