/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_3;

/**
 *
 * @author Diego
 */
public class Guess {
    
    public static void main (String args []) 
        throws java.io.IOException{
    
        char ch, answer = 'K';
        System.out.println("cap_3.Guess.main()");
        System.out.println("I'm thinking in a letter between A and Z .");
        System.out.print("Can you guess it ? ");
        
        ch=(char) System.in.read();// read the char from the keyboard
        
        if (ch==answer)System.out.println("**RIGHT**");
        
        else {
            
            System.out.println("**ERROR**");
            
            if (ch<answer)  System.out.println("too low");
            else System.out.println("too high");
        }
               
        
    }
    
}
