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
public class MinMax {
    public static void main (String args[]){
        int nums [] = new int[10];
        int min,max;
        
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 50;
        nums[3] = 29;
        nums[4] = 85;
        nums[5] = 9;
        nums[6] = 3;
        nums[7] = 53;
        nums[8] = 4;
        nums[9] = -80;
        
        min = max = nums[0]; // se inicializa con [0]
        
        for (int i = 1;i<10;i++){
            if (nums[i]<min) min = nums[i];
            if (nums[i]>max) max = nums[i];
        }
        System.out.println("min and max : "+min+" "+max);    
    } 
}
