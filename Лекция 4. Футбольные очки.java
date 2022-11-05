import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      int numderOfPoints = 1;
      
      switch(numderOfPoints) {
      
      case 3:
      System.out.println("Победа"); 
      break;
      
      case 1:
      System.out.println("Ничья"); 
      break;
       
      case 0:
      System.out.println("Проигрыш"); 
      break;
       
       default:
       System.out.println("Некорректное число"); 
       break;
      }
  }
}
