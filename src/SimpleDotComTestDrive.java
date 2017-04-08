/**
 * Created by rfixe on 4/7/2017.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        int[] location = {2, 3, 4};

        dot.setLocationCells(location);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);
//
//        String testResult = "failed";
//
//        if (testResult.equals("hit")) {
//            testResult = "passed";
////        }else if(testResult.equals("miss")){
////            testResult = "failed";
////        }
//            System.out.println(testResult);
//        }
    }
}
