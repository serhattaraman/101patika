import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String sifre,kulaniciAdi,yeniSifre;

        Scanner input= new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin ");
        kulaniciAdi=input.nextLine();

        System.out.print("Şifrenizi girin ");
        sifre=input.nextLine();

        if (kulaniciAdi.equals("admin")&& sifre.equals("1234")){
            System.out.print("Başarılı bir şekilde giriş yaptınız");
        }
        else {
            System.out.print("Hattalı bir giriş yaptınız. Şifrenizi değiştirmek ister misiniz?(evet/hayır)");
            String sonuc=input.nextLine();

            switch (sonuc){
                case "evet":
                    System.out.print("Lütfen yeni şifrenizi girin");
                    yeniSifre=input.nextLine();
                    if (yeniSifre.equals("1234")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.print("Yeni şifreniz başarıyla oluşturuldu: "+yeniSifre);
                    }
                    break;
                case "hayır":
                    System.out.print("Lütfen tekrar deneyin");
                    break;

            }



        }

        }




}
