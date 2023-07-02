
import java.util.*;

public class katlariSayilar {
      public static void main(String[] args) {

              Scanner input = new Scanner(System.in);
              int number, sum = 0;


              do {
                  System.out.print("Bir sayı girin: ");
                  number = input.nextInt();
                  if  (number % 4 == 0) {
                      sum += number;
                  }
                  else if (number%2 != 0)
                  {
                      System.out.println("Tek sayı girdiniz");
                  }

              } while (number % 2 == 0);

              System.out.print("Toplam: "+ sum);

          }
    }
