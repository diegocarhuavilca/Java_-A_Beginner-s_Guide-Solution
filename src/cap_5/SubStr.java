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
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move" ;
        
        //construc a substring
        String substr = orgstr.substring(5, 18);
        
        System.out.println("orgstr: "+orgstr);
        System.out.println("substr: "+substr); 
    }
    
}
