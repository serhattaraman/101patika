import java.util.Scanner;

public class buyukAndKucuk {
    public static void main(String[] args) {
        int buyuk,kucuk,n,tekrar;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");

        tekrar=input.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        n=input.nextInt();
        buyuk=n;
        kucuk=n;
        for (int i=2; i<n; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            n = input.nextInt();

            if (n > buyuk) {
                buyuk = n;
            }

            if (n < kucuk) {
                kucuk = n;
            }
        }

        System.out.print("En büyük sayi" + buyuk);
        System.out.print("En küçük sayi"+kucuk);





    }
}
