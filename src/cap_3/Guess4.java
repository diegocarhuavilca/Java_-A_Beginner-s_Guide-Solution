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
public class Guess4 {
    public static void main(String[] args)
        throws java.io.IOException{
        
        char ch,ignore,answer='K';
        
        do{
            System.out.println("I'm thinking in a letter between A and Z .");
            System.out.println("Can you guees it ?");
            
            //read character
            ch = (char) System.in.read();
            
            //discard any other characters in the input buffer
            do {  
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            
            if(ch==answer) System.out.println("**RIGHT**");
            else{
                System.out.println("Sorry you are ");
                if (ch<answer) System.out.println("to low");
                else System.out.println("too high");
                System.out.println("Try again \n");
            }   
        } while (answer !=ch); 
    }
}
