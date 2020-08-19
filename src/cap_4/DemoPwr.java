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
class Pwr{
    double b;//(*)
    int e ;
    double val;
    
    Pwr (double b , int e){
    this.b = b ; // el this.b hace llamado al b de la variables (*)no al del parametro Pwr(double b ...)
    this.e = e;
    
    val = 1 ;
    if (e==0) return ;
    for (;e>0;e--) val *=b;
    }
    
    double get_pwr(){
        return this.val;    
    }
}


class DemoPwr {
    public static void main (String args[]){
        Pwr x = new Pwr (4.0,2);
        Pwr y = new Pwr (2.5,1);
        Pwr z = new Pwr (5.7,0);
        
        System.out.println(x.b + " raised to the " +x.e +
                            " power is " + x.get_pwr());
        
        System.out.println(y.b + " raised to the " +y.e +
                            " power is " + y.get_pwr());
        
        System.out.println(z.b + " raised to the " +z.e +
                            " power is " + z.get_pwr());
        
    
    
    }
    
}
