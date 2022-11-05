import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      int someNumber = 15;
      
      int d = someNumber/10;
      int u = someNumber%10;
      int sum = d+u;
      
      System.out.println(sum);
    
      if(someNumber>9) {
      if(someNumber<100) {
      
      System.out.println("Число двузначное");
      }
   
     if(someNumber<sum) {
      
      System.out.println("Число меньше суммы его цифр");
      
      }
   else {
     System.out.println("Число больше суммы его цифр");
   }
   
   
    }
    
 

  }
}