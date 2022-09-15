
package ex02.photon.badiola;

/**
 *
 * @author sean amongus ඞ
 */
import java.util.Scanner;

public class Ex02PhotonBadiola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, ansnum;
        int range = 10, min = 1;
        do{
        System.out.println("""
                           Welcome to Higher or Lower! What will you do?
                           -Start game
                           -Change settings
                           -End application
                           """);
        
        input = sc.nextLine();
        
        switch(input){
            
            case "Start game":
                
                int random = (int) Math.floor(Math.random()*range) + min;
                System.out.print("You have 3 guess(es) left. What is your guess? " + random + range + min);
                ansnum = sc.nextLine();
                break;
                
            case "Change settings": 
                System.out.print("""
                                 What is the lower limit of the random number?
                                 What is the upper limit of the random number?
                                 How many guesses are allowed?
                                 """);
                break;
                
        }
            
    }while(!input.equalsIgnoreCase("End application"));
        
        
    
}
}
