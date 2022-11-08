import java.util.*;

public class вклад {
    public static void main(String[] args) {
      
      double depo = 1000;
      double percent = 0.02 ;
      double depoSum = 1200;
      double Sum = 30;
      double payment = 0;
      int MonthCounter = 0;
      int MonthPaymentResult = 0;
      int depoResult = 0;
      while (true)
      {
        if (payment>Sum && depo>depoSum)
           break;
           MonthCounter++;
          if (payment <= Sum)
        {
          MonthPaymentResult = MonthCounter;
        }
          if (depo<= depoSum)
        {
          depoResult = MonthCounter;
        }
        
        payment = depo*percent;
        depo +=payment;
     
        System.out.printf("%d %f %f\n", MonthCounter, depo, payment);
      }
        
      System.out.printf("На %d месяц величина ежемесячного увеличения вклада превысит 30 рублей\n", MonthPaymentResult);
      System.out.printf("На %d месяц размер вклада превысит 1200 рублей\n", depoResult);

  }
}
