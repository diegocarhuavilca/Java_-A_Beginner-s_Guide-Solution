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

class Vehicle{
    int passengers; //number of passengers
    int fuelcap;    //fuel capacity on galons
    int mpg;        //fuel consumption in miles per gallon
    
    //Return the range
    int range (){
        return mpg*fuelcap;
    }
    
    //Return fuel needed for a given distance
    double fuelneeded (int miles){
    return (double) miles/mpg;
    }
}

class VehicleDemo {
    public static void main (String args[]){
        Vehicle minivan = new Vehicle();
        
        
        
        
        //assign values to field in minivan
        minivan.passengers = 7;     //using the dot operator to access a member
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        //compute the range assuming a full tank of gas
       
        System.out.println("Minivan can carry "+ minivan.passengers + " with a range of "+minivan.range());

    }
}
