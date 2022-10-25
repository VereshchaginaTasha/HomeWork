import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      //Лекция 3. 
      //Задача 1
      
      int d = 234;
      int w =7;
      int m = 12;
      int week = d/w;
      int month = d/m;
      
      System.out.println(week);
      System.out.println(month);
      
      //Задача 2.
      
      int a = 39;
     
      int b = a/10; // количество десятков числа 39;
      System.out.println(b);
      
      int c = a%10; // количество единиц числа 39; 
      System.out.println(c);
      
      int sum = b+c; //сумма цифр числа 39;
      System.out.println(sum);
      
      int prod = b*c; // произведение цифр числа 39;
      System.out.println(prod);
  }
}