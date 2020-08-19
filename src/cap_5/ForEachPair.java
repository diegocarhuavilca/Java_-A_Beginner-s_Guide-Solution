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
public class ForEachPair {
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        
        for (int x : nums){
        if (x%2==0) sum+=x;
        if (x==9) break;
        }
        System.out.println(sum);
    }
    
}
