// Инициализация массивов
import java.util.*;

public class Main {
    
    public static void print(int[] array) {
      
      for(int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      int[] array = new int[7];
      
      print(array);
  }
}