import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int boxerWeit = 91;
      
      if (boxerWeit<60) {
      System.out.println("Категория боксера: легкий вес"); 
      }
       else { 
      
      if (boxerWeit<75) {
      System.out.println("Категория боксера: средний вес"); 
      } 
       else {
      
      if (boxerWeit<91) {
      System.out.println("Категория боксера: тяжелый вес"); 
      }
       else {
      
      if (boxerWeit>=91) {
      System.out.println("Категория боксера: супертяжелый вес"); 
      }
      }
       }
}
  }
}