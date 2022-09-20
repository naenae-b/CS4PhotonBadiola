
package ex02.photon.badiola;

/**
 *
 * @author sean amongus ඞ
 */
import java.util.Scanner;

public class Ex02PhotonBadiola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int max = 10, min = 1, guessCount = 3;
        do{
        System.out.println("""
                           Welcome to Higher or Lower! What will you do?
                           -Start game
                           -Change settings
                           -End application
                           """);
        
        input = sc.nextLine();
        
        switch (input){
            
            case "Start game":
              
                   int random = (int) Math.floor(Math.random()*(max-min)) + min;
                   var rYes = "y";
                   var rNo = "n";
              
                   for (int i = guessCount;i > 0; i--) {
                          System.out.println("You have " + i + " guess(es)! What is your guess?");
                          Scanner guessInput = new Scanner(System.in);
                        int Guess = guessInput.nextInt();
                  
                        if (Guess == random){
                             System.out.println("You got it!");
                             System.out.println("Play again (y/n)?");
                             break;
                      
                        } else if (Guess > random) {
                              System.out.println("Guess lower! You have " + i + " guess(es) left! What is your guess?");
                        } else if (Guess < random) {
                       System.out.println("Guess higher! You have " + i + " guess(es) left! What is your guess?");
                         }
                      }
              
                   Scanner reInput = new Scanner(System.in);
                 String replay = reInput.nextLine();
                    if (replay.equals(rYes))
                             continue;
                    if (replay.equals (rNo))
                            System.out.println("\nThank you for playing!");
                            break;
                 
                
            case "Change settings": 
                System.out.print("""
                                 What is the lower limit of the random number?
                                 What is the upper limit of the random number?
                                 How many guesses are allowed?
                                 """);
                
              System.out.println("Lower limit: ");
              Scanner lowerLimit = new Scanner(System.in);
              min = lowerLimit.nextInt();
              
              System.out.println("Upper limit: ");
              Scanner upperLimit = new Scanner(System.in);
              max = upperLimit.nextInt();
              
              System.out.println("Guesses: ");
              Scanner guessLimit = new Scanner(System.in);
              guessCount = guessLimit.nextInt();
                break;
            
            case "End application":
                System.out.print("\nThank you for playing!\n");
                break;
                
        }
            
    }while(!input.equalsIgnoreCase("End application"));
        
        
    
}
}
