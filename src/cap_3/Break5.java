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
public class Break5 {
    public static void main(String[] args) {
        done:
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    System.out.println(k+" ");
                    if (k==5) break done;//jump out of done
                }
                System.out.println("After k loop");
            }
            System.out.println("After j loop");
        }
        System.out.println("Out of loop");
    }
}
