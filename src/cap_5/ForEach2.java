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
public class ForEach2 {
    public static void main(String args[]) {

    int sum = 0;
    int nums[][]=new int [3][5];
    
    //give nums some values
    
    for(int i=0; i<3;i++)//filas
    {for(int j=0;j<5;j++)//columnas
        { nums[i][j] = (i+1)*(j+1);
            System.out.println("Val de nums["+i+"]["+j+"]= "+nums[i][j]);
        }
    
    }
    
    
    for (int[]x:nums){//solo consigue los valores de las filas
        
        for (int y:x){
            System.out.println("The value of num : "+y);
            sum+=y;
        }
    }
    
        System.out.println("Summation"+sum);
    
    
    
        }
}
