import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int number,n;


        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen kaç hanalei Fibonnaci serisi istediğinizi girin: ");
        n=input.nextInt();

        int a=0;
        int b=1;
        int c=0;
        for (int i=2; i<n; i++)
        {

            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }




    }
}
