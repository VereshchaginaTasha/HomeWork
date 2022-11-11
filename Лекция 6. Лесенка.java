import java.util.*;

public class Main {
   
   public static void print(int number, int col, int rows) {
        
       for(int j = 0; j < rows; j++) {
       for(int i = 0; i <j; i++) {
         System.out.print(number +" ");
        
         }
         System.out.println();
       }
       
      }
   
    public static void main(String[] args) {
      
       print(3, 7, 5);
  }
}