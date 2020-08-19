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
public class Search {
    public static void main (String args[]){
    int nums[] = {1,2,3,4,5,6,8,9};
    int val =6;
    boolean found=false;
    
    for(int x:nums){
        
        if(x==val){
        found = true;
        break;
        }
    
    }
    
    if (found) System.out.println("Value found");
    
    
    }
    
}
