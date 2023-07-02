import java.util.Scanner;

public class besinkatlari {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");

        sayi=input.nextInt();

        System.out.println("Dördün katları :");
        for (int i=1; i<sayi; i*=4){

            System.out.println(+i);
        }
        System.out.println("Beşin katları :");
        for (int i=1; i<sayi; i*=5){

            System.out.println(i);
        }
    }
}
