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
public class Help2 {
    public static void main(String[] args) 
        throws java.io.IOException{
        char choice, ignore;
        do {
            System.out.println("Help on :");
            System.out.println("    1.If");
            System.out.println("    2.Switch");
            System.out.println("    3.For");
            System.out.println("    4.While");
            System.out.println("    5.Do-While\n");
            System.out.print("Choose one :");
            
            choice = (char) System.in.read();
            
            do {
              ignore = (char) System.in.read();
            } while (ignore != '\n');
            
        } while (choice <'1'|choice >'5');
        
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
                   
               case '3':
                   System.out.println("The for : \n");
                   System.out.print("for (init; condition ;iteration)");
                   System.out.print("statement;");
                   break;
                   
                case '4':
                   System.out.println("The while : \n");
                   System.out.print("while(condition) statement;");
                   break;
                   
                case '5':
                   System.out.println("The do-while : \n");
                   System.out.print("do{");
                   System.out.print("   statement;");
                   System.out.print("}  while(condition)");
                   break;     
                   
               default :
                   System.out.println("Selection not found");

           }
        
    }
    
}
