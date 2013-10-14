
package kata2;

import java.util.HashMap;


public class Kata2 {
   
    public static void main(String[] args) {
       int[] array = {1,2,3,6,27,9,6,6,4,6};
       
     HashMap <Integer, Integer> frecuencyMap = new  HashMap <>();
    
       int max = 0;
       int key = -1;
       for (int value = 0; value < array.length; value++) {
          frecuencyMap.put(array[value], (getFrecuency(array[value] , frecuencyMap)) +1 );          
           
       }
      
        for (int value = 0; value < array.length; value++) {
            if (frecuencyMap.get(array[value]) >= max){
                max = frecuencyMap.get(array[value]);
                key = array[value];
            }
                
        }
        printValues (max, key);
       }
      public static void printValues (int max, int key){
          System.out.println("El valor que se repite un mayor número de veces es el "+key+
                  " con "+max+" número de veces");
      }
   
      public static Integer getFrecuency( int value, HashMap <Integer, Integer> frecuencyMap) {
          if (frecuencyMap.containsKey(value))  
          return frecuencyMap.get(value);
          return 0;    
    }
} 
