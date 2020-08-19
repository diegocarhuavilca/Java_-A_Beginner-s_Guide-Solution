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
public class Help {
    
    public static void main (String args [])
           throws java.io.IOException{
    
    char choice;
    
    
        System.out.println(" Help on : ");
        System.out.println("1. If \n2. Switch");
        System.out.print("Choose one : ");
        
        choice = (char)System.in.read();
        
        System.out.println("");
        
        switch (choice){
               case '1' :
                   System.out.println("The if \n");
                   System.out.println("if (condition) statement; ");
                   System.out.println("else statement;");
                   break;
               case '2' :
                   System.out.println("The switch \n");
                   System.out.println("switch (expression){");
                   System.out.println(" case constant : ");
                   System.out.println("     statement sequence");
                   System.out.println("     break;");
                   System.out.println(" //...");
                   System.out.println("}");
                   break;
               default :
                   System.out.println("Selection not found");

           }
    }
}
