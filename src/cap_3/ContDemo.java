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
public class ContDemo {
    public static void main(String[] args) {
        int i ;
        //print even numbers between 0 and 100
        for(i=0;i<=100;i++){
            if ((i%2)!=0) continue; //iterate (condition to keep going)
            System.out.println(i);        
        }
    }
}
