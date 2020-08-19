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
public class ReMeth {
    
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist= 252;
            
        //asign values to fields minivan
        minivan.passengers = 7;     //using the dot operator to access a member
        minivan.fuelcap = 16;
        minivan.mpg = 21;
    
        //asign values fields to sportcar
        sportscar.passengers =2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
        //get the ranges
        
        gallons = minivan.fuelneeded(dist);
                
        
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.range() + " miles.");
        System.out.println("To go "+ dist + " miles minivan needs "+gallons+" gallons of fuel." + "\n");
        
        gallons = sportscar.fuelneeded(dist);
        
        System.out.println("Sportscar can carry " + sportscar.passengers +" with a range of " + minivan.range() + " miles. ");
        System.out.println("To go "+ dist + " miles sportscar needs "+gallons+" gallons of fuel.");
        
        
    }
    
    
}
