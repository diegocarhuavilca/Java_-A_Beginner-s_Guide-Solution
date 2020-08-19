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

class TwoVehicles {
    public static void main (String args []){
    Vehicle minivan = new Vehicle();
    Vehicle sportscar = new Vehicle();
    
    int range1,range2;
    
    //asign values to fields minivan
    minivan.passengers = 7;     //using the dot operator to access a member
    minivan.fuelcap = 16;
    minivan.mpg = 21;
    
    //asign values fields to sportcar
    sportscar.passengers =2;
    sportscar.fuelcap = 14;
    sportscar.mpg = 12;
    
    //compute ranges assuming a full tank gas
    range1 = minivan.fuelcap*minivan.mpg;
    range2 = sportscar.fuelcap*sportscar.mpg;
    
    System.out.println("Minivan can carry "+ minivan.passengers + " with a range of "+range1);
    System.out.println("Sportscar can carry "+ sportscar.passengers + " with a range of "+range2);
    
        
   
    
    }
    
}
