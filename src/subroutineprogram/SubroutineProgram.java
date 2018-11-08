/*
 * Prime Finder
 * 8/11/18
 * Will Zwart
 */

package subroutineprogram;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class SubroutineProgram {

    /**
     * @param args the command line arguments
     */
    public static void primeFinder(int userInput,int loopVariable){
        //The code that does the testing
        while (userInput>loopVariable){
            if (userInput%loopVariable == 0){
                //Catching the loopholes
                if (userInput == 1 ){
                    System.out.println("Your number is not prime.");
                    System.exit(0);
                }
                if (userInput == 0){
                    System.out.println("Your number is not prime.");
                    System.exit(0);
                }
                System.out.println("Your number is not prime.");
                System.exit(0);
            } else {
                loopVariable = loopVariable + 1;
            }
        }
    }
    public static void main(String[] args) {
        while (0 == 0){
            Scanner keyedInput = new Scanner(System.in);
            //Variables
            int userInput;
            int loopVariable = 2;
            //Give me a number
            System.out.println("What number do you want to test to see if it's prime?");
            userInput = keyedInput.nextInt();
            //Loophole catching
            if (userInput>0){
                //See if it's prime
                primeFinder (userInput,loopVariable);
                System.out.println("Your number is prime! Congratulations!");
                System.exit(0);
            } else {
                System.out.println("Add your number in as a positive instead. Multiply it by -1, and the answer will not change. Please choose a new number.");
        }
        }
    }
    
}
