import java.util.Scanner;

public class heatCalculator {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen havanın sıcaklığını girin");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Havva sıcaklığına göre kayak yapabilirsiiz");
        } else if (heat >5 && heat < 15) {

            System.out.println("Havva sıcaklığına göre sinemaya gidebilirsiniz");

        } else if (heat >15 && heat < 25) {
            System.out.println("Havva sıcaklığına göre piknik yapabilirsiniz");

        }
        else {
            System.out.println("Havva sıcaklığına göre Havuza yüzmeye gidebilirsiniz");

    }


    }
}
