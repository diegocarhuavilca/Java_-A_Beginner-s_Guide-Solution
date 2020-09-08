
package cap_6;

/**
 * 
 * @author Diego Carhuavilca <diego.carhuavilca@gmail.com>
 */
//Public vs private access

class MyClass{
    private int alpha; // private access
    public int beta;    //public access
    int gamma;          //defaul access
    
    /**Methods to access alpha . It is OK for a 
     * member of a class to access a private member
     * of the same class
     */
     
    void setAlpha (int a ){
        alpha = a ;
    }
    
    int getAlpha(){
        return alpha ;
    }
}

//***********************************************************************************//
public class AccessDemo {
    public static void main (String args[]){
        MyClass ob = new MyClass();
        //Access to alpha is allowed only through its accessor methods
        ob.setAlpha(-99); //Solo se puede seter el valor de alpha por medio de una}
                                        //funcion en la clase que se desea usar;
        System.out.println("ob.alpha is " + ob.getAlpha());
        
        //You cannot access alpha like this :
        //ob.alpha=10;
        ob.beta = 88;
        ob.gamma = 99;
    }

}
