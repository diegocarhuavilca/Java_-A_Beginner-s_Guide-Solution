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
public class TwoD {
    public static void main(String[] args) {
        int t,i;
        int table[][] = new int [3][4];
        
        for (t=0;t<3;++t){ //t => control de filas
            for (i=0;i<4;++i){ //i => control de columnas
                table[t][i] = (t*4)+i+1;
                System.out.print(table[t][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
