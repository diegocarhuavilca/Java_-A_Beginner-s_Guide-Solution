/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap_4;

/**
 *
 * @author Diego
 */

class MyClass_1{
    int x ;

    public MyClass_1(int i) {
        x=i;
    } 
}
public class ParmConsDemo {
    public static void main (String args []){
        
        MyClass_1 t1 = new MyClass_1(10);
        MyClass_1 t2 = new MyClass_1(88);
        
        System.out.println(t1.x + " " + t2.x);
    }
}
