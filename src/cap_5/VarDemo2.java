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

class MyClass{
    private int i ;
    MyClass(int k){i=k;}
    int geti(){return i;}
    void seti(int k){if(k>=0)i=k;}

}
public class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10); //Notice the use of var here.
        
        System.out.println("Value of i in mc is "+mc.geti() );
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti()) ;
               
    }
    
}
