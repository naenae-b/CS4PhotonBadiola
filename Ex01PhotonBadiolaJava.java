/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.photon.badiola.java;

/**
 *
 * @author local.admin
 */
public class Ex01PhotonBadiolaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //chair 1
        String chair1 = "Chairry"; // chair name
        Boolean stableChr1 = false; // stability of chair
        Byte legsChr1 = 3; //number of legs on chair
        
        //chair 2
        String chair2 = "Chairise"; // chair name
        Boolean stableChr2 = false; // stability of chair
        Byte legsChr2 = 5; //number of legs on chair
        
        //chair 3
        String chair3 = "Chairles"; // chair name
        Boolean stableChr3 = false; // stability of chair
        Byte legsChr3 = 2; //number of legs on chair
        
        
        System.out.print("Chair 1\nChair name: " + chair1 + "\n" + "Stability of chair: " + stableChr1 + "\nNumber of legs: " + legsChr1);
        
        System.out.print("\n\nChair 2\nChair name: " + chair2 + "\n" + "Stability of chair: " + stableChr2 + "\nNumber of legs: " + legsChr2);
        
        System.out.print("\n\nChair 3\nChair name: " + chair3 + "\n" + "Stability of chair: " + stableChr3 + "\nNumber of legs: " + legsChr3);
        
        System.out.print("\n\nTotal leg count: ");
        System.out.println(legsChr1+legsChr2+legsChr3);
        
        System.out.print("\n\nMost Legged Chair: ");
        if (legsChr2>legsChr1){
            
            if (legsChr3>legsChr2){ System.out.print("Chair 3"); }
            
            else{ 
                if (legsChr2>legsChr3){ System.out.print("Chair 2"); }
            
                else{ System.out.print("None"); }
            }
        }
        else{
            if (legsChr1>legsChr2){ 
                if (legsChr1>legsChr3){ System.out.print("Chair 1"); }
            
                else{ 
                    if (legsChr3>legsChr1){ System.out.print("Chair 3"); }
            
                    else{ System.out.print("None");}
                }       
            }
            else{ System.out.print("None");}
    
        }
        
        System.out.print("\n\nUnstable Chairs: ");
        if (stableChr1 != true){
            System.out.print("Chair 1 ");
        }
        else{
            System.out.print("");
            
        }if (stableChr2 != true){
            System.out.print("Chair 2 ");
        }
        else{
            System.out.print("");
            
        }if (stableChr3 != true){
            System.out.print("Chair 3 ");
        }
        else{
            System.out.print("");
        }
}
}



