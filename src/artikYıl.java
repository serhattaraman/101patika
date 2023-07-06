import java.util.Scanner;

public class artikYıl {
    public static void main(String[] args) {
        int artikYıl;
        Scanner yil=new Scanner(System.in);
        System.out.print("yıl Giriniz :");
        artikYıl=yil.nextInt();


        if (artikYıl % 4 != 0){
            System.out.println("Artik yil degil");
        }else if(artikYıl%100 != 0 ){
            System.out.println("Artik yil");
        } else if (artikYıl%400 ==0) {
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil degil");
        }
    }
}
