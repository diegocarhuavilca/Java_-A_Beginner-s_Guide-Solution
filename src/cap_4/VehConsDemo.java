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

class Vehicle_1{
    
    int passengers,fuelcap,mpg;
    
    //this is the constructor for Vehicle_1

    Vehicle_1(int p, int f , int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    //return the range
    int range (){
     return fuelcap*mpg;
    }
    
    //Compute fuel needed for a given distance
    double fuelneeded (int miles){
        return (double) miles/mpg;
    }
}

class VehConsDemo {
    public static void main (String args[]){
        //Construct complete vehicle
        Vehicle_1 minivan = new Vehicle_1 (7,16,21);
        Vehicle_1 sportscar =  new Vehicle_1 (2,14,12);
        double gallons;
        int dist = 252;
        
        gallons = minivan.fuelneeded(dist);
        
        System.out.println("To go "+ dist+" miles minivan needs "+
                            gallons+ " gallons of fuel. ");
        
        gallons=sportscar.fuelneeded(dist);
        
        System.out.println("To go "+ dist+" miles sportscar needs "+
                            gallons+ " gallons of fuel. ");
        
    
    
    }
    
}
