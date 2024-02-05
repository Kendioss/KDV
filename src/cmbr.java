import java.util.Scanner;
public class cmbr {
    public static void main(String[] args) {
        int r ;
        double pi=3.14;
        System.out.print("Dairenin yaricapi uzunlugunu giriniz :");

        Scanner input=new Scanner(System.in);
        r= input.nextInt();
        double alan = r*r*pi;
        double cevre = 2*r*pi;

        System.out.println("Dairenin Alani : " +alan);
        System.out.println("Dairenin Cevresi : " +cevre);

    }
}
