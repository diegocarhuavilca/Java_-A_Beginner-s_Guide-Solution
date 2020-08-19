/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_5;

/**
 *
 * @author Diego
 */
public class ArrayError {
    public static void main(String[] args) {
        int sample[] = new int [10];
        
        //generate array overrun
        for(int i = 0;i <100;i++)
            sample[i]=i;
        
    }
}
