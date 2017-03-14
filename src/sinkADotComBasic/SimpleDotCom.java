package SinkADotComBasic;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author nicholas.fredricks
 */
public class SimpleDotCom {
    
    private static ArrayList<String> possibleLocations;
    static int numOfHits = 0;
    static String stringGuess;
    static int playMore = 1;
    static boolean isAlive = false;
    static int numOfGuesses = 0;
    
    public static void main(String [] args) {
        
        System.out.println("Welcome to our simple Kill The DotCom game.\n"
                + "You guess the location of the DotCom and when you get 3 hits the DotCom dies and you win!\n"
                + "Let's get started.");
        
        while (playMore == 1)
        {
            isAlive = true;
            gameSetup();
            
            while (isAlive == true)
            {
                getUserGuess();
                setGuessedLocation(possibleLocations);
                checkGuess(stringGuess);
            }
        }
    }    
  
    public static void gameSetup(){

        ArrayList<String> dotComLocations = new ArrayList<>();
        SimpleDotCom theDotCom = new SimpleDotCom();        
        int dotCom = (int) (Math.random() * 5);
        String firstLocation = Integer.toString(dotCom);
        dotComLocations.add(firstLocation);
        String secondLocation = Integer.toString(dotCom + 1);
        dotComLocations.add(secondLocation);
        String thirdLocation = Integer.toString(dotCom + 2);
        dotComLocations.add(thirdLocation);
        SimpleDotCom.setGuessedLocation(dotComLocations);        
    }
    
    public static String getUserGuess(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a guess:");
        stringGuess = scan.next();
        
        while (stringGuess.length() == 0)
        {
            System.out.println("The number you enter cannot be 0.\nPlease pick another number.");
        }
        
        return stringGuess;
    }
    
    public static void setGuessedLocation(ArrayList<String> dotComLocations){
        
        possibleLocations = dotComLocations;
    }
    
    public static String checkGuess(String stringGuess){
        
        int index = possibleLocations.indexOf(stringGuess);
        String guessOutcome;
        
        numOfGuesses = numOfGuesses + 1;
        
        if (index >= 0)
        {
            numOfHits = numOfHits++;
            possibleLocations.remove(index);
            guessOutcome = "You hit my DotCom! But it's not dead yet!";    
                
            if (possibleLocations.isEmpty())
            {                  
                isAlive = false;
                System.out.println("You killed my DotCom!");
                System.out.println("It took you " + numOfGuesses + " guesses to kill my DotCom.");
                System.out.println("Thanks for playing");
                playAgain();
            }            
        }
        
        else
        {
            guessOutcome = "Nice try, you completely missed my DotCom!";  
        }
         
        System.out.println(guessOutcome);
        return guessOutcome;
    }
    
    public static int playAgain (){
        Scanner scan = new Scanner(System.in);
              
        System.out.println("Would you like to play again? \nPress 1 for yes or 2 for no.");
        playMore = scan.nextInt();
        
        if (playMore != 1)
        {
            System.exit(0);
        }
        
        return playMore;
    }
}

