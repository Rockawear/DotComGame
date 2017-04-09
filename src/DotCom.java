import java.util.ArrayList;

/**
 * Created by rfixe on 4/7/2017.
 */
public class DotCom {
    String nameHolder;
    ArrayList<String> locationCells = new ArrayList<>();

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public void setLocationCells(ArrayList<String> loc) {

        this.locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + nameHolder + "  : (");
            } else
                result = "hit";

        }
        return result;
    }


}
