/*
 * Subroutine Practice
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
    public static void primeFinder(int userInput,int loopVariable, Scanner keyedInput){
        //Give me a number
        System.out.println("What number do you want to test to see if it's prime? ");
        userInput = keyedInput.nextInt();
        //The code that does the testing
        if (userInput>0){
        //See if it's prime
        while (userInput>loopVariable){
            if (userInput%loopVariable == 0){
                //Catching the loopholes
                if (userInput == 1 ){
                    System.out.println("Your number is not prime. ");
                }
                if (userInput == 0){
                    System.out.println("Your number is not prime. ");
                }
                //End of loophole catching
                System.out.println("Your number is not prime. ");
            } else {
                loopVariable = loopVariable + 1;
            }
        }
        System.out.println("Your number is prime! Congratulations! ");
        } else {
            System.out.println("Add your number in as a positive instead. Multiply it by -1, and the answer will not change. Please choose a new number. ");
        }
    }
    public static void volumeOfACube (int userInput, Scanner keyedInput){
        //Getting a number
        System.out.println("What length are the sides of your cube? ");
        userInput = keyedInput.nextInt();
        //The answer
        System.out.println("The volume is "+Math.pow(userInput,3)+" units^3. ");
    }
    public static void missingTriangleAngle (int userInput,int answer, Scanner keyedInput){
        //Getting the first angle
        System.out.println("What is the first angle you have? ");
        userInput = keyedInput.nextInt();
        answer = 180 - userInput;
        //Second angle
        System.out.println("What is the second angle you have? ");
        userInput = keyedInput.nextInt();
        answer = answer - userInput;
        //Answer
        System.out.println("The final angle of your triangle is "+answer+" degrees. ");
    }
    public static void perimeterOfASquare(int userInput, Scanner keyedInput){
        //Getting the side length
        System.out.println("What is the length of your sides? ");
        userInput = keyedInput.nextInt();
        //Answer
        System.out.println("The size of your perimeter is "+userInput*4+" units. ");
    }
    public static void main(String[] args) {
        while (0 == 0){
            Scanner keyedInput = new Scanner(System.in);
            //Variables
            int userInput;
            int loopVariable = 2;
            //Choosing what you want the program to do
            System.out.println("Type 1 to find the perimeter of a square.");
            System.out.println("Type 2 to find the missing angle on a triangle.");
            System.out.println("Type 3 to find the volume of a cube.");
            System.out.println("Type 4 to find out if your number is prime.");
            System.out.println("Type 5 to exit.");
            userInput = keyedInput.nextInt();
            //Taking the choice
            switch (userInput) {
                case 1:
                    perimeterOfASquare (userInput,keyedInput);
                    break;
                case 2:
                    missingTriangleAngle (userInput,loopVariable,keyedInput);
                    break;
                case 3:
                    volumeOfACube (userInput,keyedInput);
                    break;
                case 4:
                    primeFinder (userInput,loopVariable, keyedInput);
                    break;
                case 5:
                    System.out.println("Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Please try again.");
                    break;
            } 
        }
    }
}