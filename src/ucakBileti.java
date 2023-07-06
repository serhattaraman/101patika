import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km, costPerKm = 0.1 , total;
        byte type;
        int age;
        boolean isError = false;

        //kullanıcıdan mesafe isteme
        System.out.print("Mesafeyi dahil ediniz : ");
        km = inp.nextDouble();

        //kullanıcıdan yaş bilgisi alınması
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();

        //yol tipi öğrenilmesi
        System.out.print("Yolculuk tipini giriniz (1 : Tek Yön , 2 : Gidiş Dönüş ): ");
        type = inp.nextByte();
        total = km * costPerKm;

        //kullanıcıya yaşına göre indirim belirleme
        if (age<12){
            total *= 0.5;
        }
        else if (age>=12 && age<=24) {
            total *= 0.9;
        }
        else if (age>65) {
            total *= 0.7;
        }

        //yol tipine göre indirim ve yol ücreti belirleme
        switch (type){
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            case 1:
                total = total;
                break;
            default:
                isError = true;
        }

        if (km>=0)
        {
            System.out.print("Toplam tutar: " +total+"₺");
        }
        else {
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}
