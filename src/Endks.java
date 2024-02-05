import java.util.Scanner;

public class Endks {
    public static void main(String[] args) {
        double Kg, Boy,Endeks;

        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz :");
        double boy =input.nextDouble();
        System.out.print("Kilonuzu giriniz :");
        double kg=input.nextDouble();

        Endeks=(kg/(boy*boy));
        System.out.println("Vucut Kitle Endeksiniz : " + Endeks);



    }
}
