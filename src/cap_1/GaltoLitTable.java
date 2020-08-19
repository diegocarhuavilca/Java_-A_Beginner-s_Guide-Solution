
package cap_1;

class GaltoLitTable {
   public static void main (String args[]){
       double gallons,liters;
       int counter;
       
       counter = 0; // se inicializa en 0 el contador
       for (gallons = 1; gallons <=100 ; gallons++){
           liters = gallons*3.7854;//conversion a litros
           System.out.println(gallons +" gallons is " + liters + " litters .");
          
           counter++;
           
           if(counter ==10){
               System.out.println();
               counter=0;
            }    
        }
    }  
}
