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
public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
    
        
        
       
        
        //asign values to fields minivan
        minivan.passengers = 7;     //using the dot operator to access a member
        minivan.fuelcap = 16;
        minivan.mpg = 21;
    
        //asign values fields to sportcar
        sportscar.passengers =2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
        System.out.println("Minivan can carry " + minivan.passengers + ".");
        
        minivan.range(); // display range of minivan
        
        System.out.println("Sportscar can carry " + sportscar.passengers + ". ");
        
        sportscar.range(); //display range of sportscar
        
    }
    
}
