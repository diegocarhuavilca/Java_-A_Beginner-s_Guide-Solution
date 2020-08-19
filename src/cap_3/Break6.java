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
public class Break6 {
    public static void main (String args[]){
    int x=0,y=0;
    
    //here put the label before the statement
    stop1: for (x=0;x<5;x++){
                for (y=0;y<5;y++){
                    if(y==2) break stop1;
                    System.out.println("x and y: "+x+" "+y);
                }
            }
            System.out.println();
            
        //now put inmediately before{
        
        for(x=0;x<5;x++){
            System.out.println("");

    stop2:  {
                for (y=0;y<5;y++){
                    if(y==2) break stop2;
                    System.out.println("x and y: "+x+" "+y);
                }
            }    }
    }
}
