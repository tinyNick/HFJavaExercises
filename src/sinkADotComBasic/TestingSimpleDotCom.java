package SinkADotComBasic;

import java.util.ArrayList;

/**
 * @author nicholas.fredricks
 */
public class TestingSimpleDotCom {
    
    public static void main (String [] args){
        
        SimpleDotCom dot = new SimpleDotCom();
        
        ArrayList<String> testDotComLocations = new ArrayList<>();
        String firstLocation = Integer.toString(2);
        testDotComLocations.add(firstLocation);
        String secondLocation = Integer.toString(3);
        testDotComLocations.add(secondLocation);
        String thirdLocation = Integer.toString(4);
        testDotComLocations.add(thirdLocation);
        SimpleDotCom.setGuessedLocation(testDotComLocations);
        
        String userGuess = "2";
        String result = SimpleDotCom.checkGuess(userGuess);
        String testResult = "failed";
        
        if (result.equals("You hit my DotCom! But it's not dead yet!"))
        {
            testResult = "passed";
        }
        
        System.out.println(testResult);
    }
}

