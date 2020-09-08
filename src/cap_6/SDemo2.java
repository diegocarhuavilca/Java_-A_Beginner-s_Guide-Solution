
package cap_6;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */

class StatichMeth{
    static int val = 1024; // a static variable
    
    // a static method
    static int valDiv2(){ //<=== static method
        return val/2;
    }

}



public class SDemo2 {
    public static void main (String args[]){
        
        System.out.println("val is " + StatichMeth.val);
        System.out.println("StatichMeth.valDiv2() : "+ StatichMeth.valDiv2() );
        
        StatichMeth.val = 4 ;
        System.out.println("val is " + StatichMeth.val);
        System.out.println("StatichMeth.valDiv2() : "+ StatichMeth.valDiv2() );     
        
           
    }

}
