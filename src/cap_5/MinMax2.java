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
public class MinMax2 {
    public static void main (String args[]){
        int nums [] = {99,-10,50,29,85,9,3,53,4,-80};
        int min,max;
        
        
        min = max = nums[0]; // se inicializa con [0]
        
        for (int i = 1;i<10;i++){
            if (nums[i]<min) min = nums[i];
            if (nums[i]>max) max = nums[i];
        }
        System.out.println("min and max : "+min+" "+max);    
    } 
    
}
